package com.guilherme.app.servicoForm.service;

import com.guilherme.app.servicoForm.service.dto.FormDTO;
import javassist.NotFoundException;

import java.util.List;

public interface FormService {

    void save(FormDTO formDTO);

    FormDTO findById(Long id) throws NotFoundException;

    List<FormDTO> findAllForms();
}
