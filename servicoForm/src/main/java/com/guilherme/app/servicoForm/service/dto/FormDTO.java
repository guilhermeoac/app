package com.guilherme.app.servicoForm.service.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class FormDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String nameForm;

    private String descriptionForm;

    private Long time;

    private Long userId;
}
