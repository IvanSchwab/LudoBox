package com.ludoproject.LudoBox.services;

import com.ludoproject.LudoBox.entities.User;
import com.ludoproject.LudoBox.enums.Role;
import com.ludoproject.LudoBox.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {

    private final UserRepository userRepository;

    public UserServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // CRUD básico
    public User createUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow();
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    // --- Ejemplos de lógica con roles ---
    public void banUser(User actor, Long targetId) {
        if (actor.getRole() == Role.ADMIN || actor.getRole() == Role.MODERATOR) {
            User target = getUserById(targetId);
            // implementar lógica de baneo (flag, fecha, etc.)
            System.out.println("Usuario " + target.getUsername() + " baneado por " + actor.getUsername());
        } else {
            throw new RuntimeException("No tenés permisos para banear");
        }
    }

    public void deleteAnyUser(User actor, Long targetId) {
        if (actor.getRole() == Role.ADMIN) {
            userRepository.deleteById(targetId);
        } else {
            throw new RuntimeException("Solo el admin puede eliminar usuarios");
        }
    }
}
