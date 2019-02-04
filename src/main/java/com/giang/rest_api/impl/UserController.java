package com.giang.rest_api.impl;

import com.giang.rest_api.UserApi;
import com.giang.service.UserService;
import com.giang.service.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController implements UserApi {

    @Autowired
    private UserService userService;

    @Override
    public ResponseEntity<List<UserDTO>> getAllUser() {
        List<UserDTO> result = userService.findAllUser();
        return ResponseEntity.ok(result);
    }

    @Override
    public ResponseEntity<Boolean> updateStatusUser(@PathVariable("id") Integer id, Boolean status) {
        userService.updateStatusUser(id, status);
        return ResponseEntity.ok(true);
    }
}
