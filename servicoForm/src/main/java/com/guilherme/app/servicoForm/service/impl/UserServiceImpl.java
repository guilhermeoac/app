package com.guilherme.app.servicoForm.service.impl;

import com.guilherme.app.servicoForm.domain.User;
import com.guilherme.app.servicoForm.repository.UserRepository;
import com.guilherme.app.servicoForm.service.dto.UserDTO;
import com.guilherme.app.servicoForm.service.UserService;
import com.guilherme.app.servicoForm.service.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;
    private final UserRepository userRepository;


    @Override
    public void save(UserDTO userDTO) {
        User user = userMapper.toEntity(userDTO);
        userRepository.save(user);

    }

    @Override
    public UserDTO findById(Long id) {
        return userMapper.toDto(userRepository.findById(id).get());
    }
}
