package com.giang.service;

import com.giang.service.dto.UserDTO;

import java.util.List;

public interface UserService {

    UserDTO findByUsernameAndPassword(String username, String password);

    List<UserDTO> findAllUser();

    Boolean updateStatusUser(Integer id, Boolean value);
}
