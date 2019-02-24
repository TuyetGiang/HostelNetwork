package com.giang.rest_api.impl;

import com.giang.rest_api.UserApi;
import com.giang.service.UserService;
import com.giang.service.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

@Controller
public class UserController implements UserApi {

    @Autowired
    UserService userService;

    @Override
    public ResponseEntity<List<UserDTO>> getAllUser() {
        List<UserDTO> result = userService.findAllUser();
        return ResponseEntity.ok(result);
    }

    @Override
    public ResponseEntity<Boolean> updateStatusUser(@PathVariable("id") Integer id, Boolean status) {
        return ResponseEntity.ok(userService.updateStatusUser(id, status));
    }

    @Override
    public ResponseEntity<List<UserDTO>> getUserByTime(@RequestParam("from") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate from,
                                                       @RequestParam("to") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate to) {
        return ResponseEntity.ok(userService.findUserByTime(from, to));
    }

    @Override
    public ResponseEntity<Boolean> updateMoneyUser(@PathVariable("id") Integer id,
                                                   @RequestParam("money") Double amount) {
        return ResponseEntity.ok(userService.updateMoney(id, amount));
    }

    @Override
    public ResponseEntity<Boolean> changePassword(@PathVariable("id") Integer id,
                                                  @RequestParam("oldPassword") String oldPassword,
                                                  @RequestParam("newPassword") String newPassword) {
        return ResponseEntity.ok(userService.changePassword(id, oldPassword, newPassword));
    }

    @Override
    public ResponseEntity<UserDTO> getInforUser(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(userService.getInforUser(id));
    }
}

