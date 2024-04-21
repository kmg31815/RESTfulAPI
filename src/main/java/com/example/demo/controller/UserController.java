package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.dto.UserDto;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * User APIs
 */
@RestController
@RequestMapping("/api/v2")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public ResponseEntity<User> createUser(@RequestBody UserDto userDto) {
        User user = userService.createUser(userDto);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @GetMapping("/user")
    public ResponseEntity<User> getUserInfo() {
        User user = userService.getUserInfo();
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PutMapping("/user")
    public ResponseEntity<User> updateUserInfo(@RequestBody UserDto userDto) {
        User user = userService.updateUserInfo(userDto);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @DeleteMapping("/user")
    public ResponseEntity<String> deleteUser() {
        userService.deleteUser();
        return new ResponseEntity<>("刪除成功！", HttpStatus.OK);
    }

}
