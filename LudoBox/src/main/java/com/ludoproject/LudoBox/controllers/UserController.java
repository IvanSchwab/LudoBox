package com.ludoproject.LudoBox.controllers;

import com.ludoproject.LudoBox.entities.User;
import com.ludoproject.LudoBox.services.UserServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserServices userService;

    public UserController(UserServices userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.createUser(user));
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.ok("Usuario eliminado");
    }

    // --- Endpoints que requieren roles ---
    @PostMapping("/{id}/ban")
    public ResponseEntity<String> banUser(@PathVariable Long id, @RequestBody User actor) {
        userService.banUser(actor, id);
        return ResponseEntity.ok("Usuario baneado");
    }

    @DeleteMapping("/{id}/force")
    public ResponseEntity<String> deleteAnyUser(@PathVariable Long id, @RequestBody User actor) {
        userService.deleteAnyUser(actor, id);
        return ResponseEntity.ok("Usuario eliminado por Admin");
    }
}
