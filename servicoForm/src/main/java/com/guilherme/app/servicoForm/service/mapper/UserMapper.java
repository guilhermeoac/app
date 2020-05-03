package com.guilherme.app.servicoForm.service.mapper;

import com.guilherme.app.servicoForm.domain.User;
import com.guilherme.app.servicoForm.service.dto.UserDTO;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring", uses = {})
public interface UserMapper {

    User toEntity(UserDTO userDTO);

    UserDTO toDto(User user);

}