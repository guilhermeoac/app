package com.guilherme.app.servicoForm.service;

import com.guilherme.app.servicoForm.service.dto.FormDTO;
import com.guilherme.app.servicoForm.service.dto.NameIdDTO;
import javassist.NotFoundException;
import org.springframework.data.domain.Page;

import java.util.List;

public interface FormService {

    void save(FormDTO formDTO);

    FormDTO findById(Long id) throws NotFoundException;

    List<FormDTO> findAllForms();

    List<NameIdDTO> findByUserId(Long userId);

    void deleteById(Long id);

    Page<FormDTO> findFormsShared(Long pageNumber);
}
