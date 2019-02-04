package com.giang.rest_api;

import com.giang.service.dto.UserDTO;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Component
@RequestMapping("/users")
public interface UserApi {

    @ApiOperation(tags = {"USER"}, response = UserDTO.class, value = "Get list all user")
    @GetMapping("")
    ResponseEntity<List<UserDTO>> getAllUser();


    @ApiOperation(tags = "USER", response = Boolean.class, value = "Block/Unblock a user")
    @PutMapping("/{id}")
    ResponseEntity<Boolean> updateStatusUser(@PathVariable("id") Integer id, Boolean status);

}
