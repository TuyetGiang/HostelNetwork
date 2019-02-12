package com.giang.rest_api;

import com.giang.service.dto.UserDTO;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@Component
@RequestMapping("/users")
public interface UserApi {

    @ApiOperation(tags = {"USER"}, response = UserDTO.class, value = "Get list all users")
    @GetMapping("")
    ResponseEntity<List<UserDTO>> getAllUser();


    @ApiOperation(tags = "USER", response = Boolean.class, value = "Block/Unblock a user")
    @PutMapping("/{id}")
    ResponseEntity<Boolean> updateStatusUser(@PathVariable("id") Integer id,
                                             @RequestParam("status") Boolean status);

    @ApiOperation(tags = {"USER"}, value = "Get all users is register between 2 time", response = UserDTO.class)
    @GetMapping("/times")
    ResponseEntity<List<UserDTO>> getUserByTime(@RequestParam("start") LocalDateTime startDateTime,
                                                @RequestParam("end") LocalDateTime endDateTime);


}
