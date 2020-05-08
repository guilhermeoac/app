package com.guilherme.app.servicoForm.service.impl;

import com.guilherme.app.servicoForm.repository.AnswerRepository;
import com.guilherme.app.servicoForm.service.AnswerService;
import com.guilherme.app.servicoForm.service.dto.AnswerDTO;
import com.guilherme.app.servicoForm.service.mapper.AnswerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
@Transactional
public class AnswerServiceImpl implements AnswerService {

    private final AnswerRepository answerRepository;
    private final AnswerMapper answerMapper;

    @Override
    public void save(Long idForm) {
        AnswerDTO answerDTO = new AnswerDTO();
        answerDTO.setUserId(1l);
        answerDTO.setFormId(idForm);

        answerRepository.save(answerMapper.toEntity(answerDTO));
    }
}
