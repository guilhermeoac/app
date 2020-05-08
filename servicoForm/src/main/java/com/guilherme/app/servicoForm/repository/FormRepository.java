package com.guilherme.app.servicoForm.repository;

import com.guilherme.app.servicoForm.domain.Form;
import com.guilherme.app.servicoForm.service.dto.FormDTO;
import com.guilherme.app.servicoForm.service.dto.NameIdDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FormRepository extends JpaRepository<Form,Long> {

    @Query("select new com.guilherme.app.servicoForm.service.dto.NameIdDTO(f.id, f.name) from Form f where f.user.id = :userId")
    List<NameIdDTO> findFormByUserId(@Param("userId") Long userId);

    @Query("select new com.guilherme.app.servicoForm.service.dto.FormDTO(f.id, f.name, f.description, f.link, f.time, f.user.id) " +
            "from Form f where f.user.id <> 2 " +
            "and f.id not in (select a.form.id from Answer a where a.user.id = 1 ) " +
            "order by f.user.ranking desc")
    Page<FormDTO> findSharedForm(Pageable pageable);
}
