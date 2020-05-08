package com.guilherme.app.servicoForm.service.impl;

import com.guilherme.app.servicoForm.domain.Form;
import com.guilherme.app.servicoForm.repository.FormRepository;
import com.guilherme.app.servicoForm.service.FormService;
import com.guilherme.app.servicoForm.service.dto.FormDTO;
import com.guilherme.app.servicoForm.service.dto.NameIdDTO;
import com.guilherme.app.servicoForm.service.mapper.FormMapper;
import javassist.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import javax.transaction.Transactional;
import java.util.List;

@RequiredArgsConstructor
@Service
@Transactional
public class FormServiceImpl implements FormService {

    private final FormMapper formMapper;
    private final FormRepository formRepository;


    @Override
    public void save(FormDTO formDTO) {
        Form form = formMapper.toEntity(formDTO);
        formRepository.save(form);
    }

    @Override
    public FormDTO findById(Long id) throws NotFoundException {
        return formMapper.toDto(formRepository.findById(id).orElseThrow(() -> new NotFoundException("Registro não encontrado")));
    }

    @Override
    public List<FormDTO> findAllForms() {
        return formMapper.toListDto(formRepository.findAll());
    }

    @Override
    public List<NameIdDTO> findByUserId(Long userId){
        return formRepository.findFormByUserId(userId);
    }

    @Override
    public void deleteById(Long id) {
        formRepository.deleteById(id);
    }

    @Override
    public Page<FormDTO> findFormsShared(Long pageNumber) {
        return formRepository.findSharedForm(PageRequest.of(pageNumber.intValue(), 10));
    }
}
