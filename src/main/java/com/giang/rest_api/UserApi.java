package com.giang.rest_api;

import com.giang.service.dto.UserDTO;
import io.swagger.annotations.ApiOperation;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
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
    ResponseEntity<List<UserDTO>> getUserByTime(@RequestParam("from") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate from,
                                                @RequestParam("to") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate to);

    @ApiOperation(tags = "USER", response = Boolean.class, value = "Update money a user")
    @PutMapping("/{id}/moneys")
    ResponseEntity<Boolean> updateMoneyUser(@PathVariable("id") Integer id,
                                            @RequestParam("money") Double amount);


    @ApiOperation(tags = "USER", response = Boolean.class, value = "Change password of user")
    @PutMapping("/{id}/passwords")
    ResponseEntity<Boolean> changePassword(@PathVariable("id") Integer id,
                                           @RequestParam("oldPassword") String oldPassword,
                                           @RequestParam("newPassword") String newPassword);

    @ApiOperation(tags = {"USER"}, response = UserDTO.class, value = "Get information of an users")
    @GetMapping("/{id}")
    ResponseEntity<UserDTO> getInforUser(@PathVariable("id") Integer id);
}
