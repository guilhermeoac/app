package com.guilherme.app.servicoForm.repository;

import com.guilherme.app.servicoForm.domain.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository extends JpaRepository<Answer,Long> {
}
