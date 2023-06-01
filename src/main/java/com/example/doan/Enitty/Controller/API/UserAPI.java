package com.example.doan.Enitty.Controller.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserAPI {
//    @Autowired
//    private UserService userService;
//
//    @GetMapping("/users")
//    public List<User> getUsers() {
//        return userService.getAllUsers();
//    }
//
//    @GetMapping("/users/{id}")
//    public ResponseEntity<User> getUserById(@PathVariable(value = "id") Long userId)
//            throws ResourceNotFoundException {
//        User user = userService.getUserById(userId)
//                .orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + userId));
//        return ResponseEntity.ok().body(user);
//    }
//
//    @PostMapping("/users")
//    public User createUser(@Valid @RequestBody User user) {
//        return userService.createUser(user);
//    }
//
//    @PutMapping("/users/{id}")
//    public ResponseEntity<User> updateUser(@PathVariable(value = "id") Long userId,
//                                           @Valid @RequestBody User userDetails) throws ResourceNotFoundException {
//        User user = userService.getUserById(userId)
//                .orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + userId));
//
//        user.setEmail(userDetails.getEmail());
//        user.setFirstName(userDetails.getFirstName());
//        user.setLastName(userDetails.getLastName());
//        final User updatedUser = userService.updateUser(user);
//        return ResponseEntity.ok(updatedUser);
//    }
//
//    @DeleteMapping("/users/{id}")
//    public Map<String, Boolean> deleteUser(@PathVariable(value = "id") Long userId)
//            throws ResourceNotFoundException {
//        User user = userService.getUserById(userId)
//                .orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + userId));
//
//        userService.deleteUser(user);
//        Map<String, Boolean> response = new HashMap<>();
//        response.put("deleted", Boolean.TRUE);
//        return response;
//    }
}
