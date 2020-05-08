package com.guilherme.app.servicoForm.service.mapper;

import com.guilherme.app.servicoForm.domain.Answer;
import com.guilherme.app.servicoForm.domain.Form;
import com.guilherme.app.servicoForm.service.dto.AnswerDTO;
import com.guilherme.app.servicoForm.service.dto.FormDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;


@Mapper(componentModel = "spring", uses = {UserMapper.class, FormMapper.class})
public interface AnswerMapper {

    @Mapping(target = "user.id", source = "userId")
    @Mapping(target = "form.id", source = "formId")
    Answer toEntity(AnswerDTO answerDTO);

}