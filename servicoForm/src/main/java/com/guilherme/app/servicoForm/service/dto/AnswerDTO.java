package com.guilherme.app.servicoForm.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AnswerDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long userId;

    private Long formId;
}
