package com.guilherme.app.servicoForm.service.mapper;

import com.guilherme.app.servicoForm.domain.Form;
import com.guilherme.app.servicoForm.service.dto.FormDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;


@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface FormMapper {

    @Mapping(target = "user.id", source = "userId")
    Form toEntity(FormDTO formDTO);

    @Mapping( source = "user.id", target = "userId")
    FormDTO toDto(Form form);

    List<FormDTO> toListDto(List<Form> form);

}