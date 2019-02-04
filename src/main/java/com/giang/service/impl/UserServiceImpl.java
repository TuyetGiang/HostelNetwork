package com.giang.service.impl;

import com.giang.repository.UserRepository;
import com.giang.repository.entity.User;
import com.giang.service.UserService;
import com.giang.service.dto.UserDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class UserServiceImpl implements UserService {


    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public UserDTO findByUsernameAndPassword(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, password);
        Optional.ofNullable(user).orElseThrow(EntityNotFoundException::new);

        return this.mapToDto(user);
    }

    @Override
    public List<UserDTO> findAllUser() {
        List<User> userEntities = userRepository.findAll();

        return userEntities.stream().map(this::mapToDto).collect(Collectors.toList());
    }

    @Override
    public Boolean updateStatusUser(Integer id, Boolean value) {
        User user = userRepository.findById(id);
        Optional.ofNullable(user).orElseThrow(EntityNotFoundException::new);

        userRepository.updateStatusUser(id, value);
        return true;
    }

    private UserDTO mapToDto(User entity) {
        ModelMapper modelMapper = new ModelMapper();
        UserDTO userDTO = modelMapper.map(entity, UserDTO.class);
        userDTO.setRoleName(entity.getRoleEntity().getRoleName());
        return userDTO;
    }
}
