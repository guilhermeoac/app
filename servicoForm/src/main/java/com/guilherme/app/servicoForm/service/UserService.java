package com.guilherme.app.servicoForm.service;

import com.guilherme.app.servicoForm.service.dto.UserDTO;

public interface UserService {

    void save(UserDTO userDTO);

    UserDTO findById(Long id);
}
