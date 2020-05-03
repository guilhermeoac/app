package com.guilherme.app.servicoForm.repository;

import com.guilherme.app.servicoForm.domain.Form;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormRepository extends JpaRepository<Form,Long> {
}
