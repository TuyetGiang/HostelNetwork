package com.giang.service;

import com.giang.service.dto.UserDTO;

import java.time.LocalDate;
import java.util.List;

public interface UserService {

    UserDTO findByUsernameAndPassword(String username, String password);

    List<UserDTO> findAllUser();

    Boolean updateStatusUser(Integer id, Boolean value);

    List<UserDTO> findUserByTime(LocalDate from, LocalDate to);

    Boolean updateMoney(Integer id, Double money);

    Boolean changePassword(Integer id, String oldPassword, String newPassword);

    UserDTO getInforUser(Integer id);
}
