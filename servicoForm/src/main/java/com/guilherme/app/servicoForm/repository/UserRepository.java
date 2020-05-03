package com.guilherme.app.servicoForm.repository;

import com.guilherme.app.servicoForm.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
