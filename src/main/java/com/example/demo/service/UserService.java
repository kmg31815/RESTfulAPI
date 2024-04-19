package com.example.demo.service;

import com.example.demo.domain.Info;
import com.example.demo.domain.User;
import com.example.demo.dto.UserDto;
import org.springframework.stereotype.Service;

/**
 * User Service
 */
@Service
public class UserService {

    private User user;

    public UserService() {
        this.user = new User();
    }

    /**
     * Create user
     *
     * @param userDto the user transfer object
     * @return the user object
     */
    public User createUser(UserDto userDto) {
        user.setName(userDto.getFirstName() + "." + userDto.getLastName());
        user.setJobTitle(userDto.getJobTitle());
        Info info = new Info();
        info.setEmail(user.getName() + "@gmail.com");
        info.setMobile(userDto.getMobile());
        user.setCommunicateInformation(info);
        return user;
    }

    /**
     * Get user
     *
     * @return the user object
     */
    public User getUserInfo() {
        return user;
    }

    /**
     * Update user by name
     *
     * @param userDto the user transfer object
     * @return the user object
     */
    public User updateUserInfo(UserDto userDto) {
        if (user.getName() != null) {
            user.setName(userDto.getFirstName() + "." + userDto.getLastName());
            user.setJobTitle(userDto.getJobTitle());
            Info info = new Info();
            info.setEmail(user.getName() + "@gmail.com");
            info.setMobile(userDto.getMobile());
            user.setCommunicateInformation(info);
        }
        return user;
    }

    /**
     * Delete user
     */
    public void deleteUser() {
        user = new User();
    }

}
