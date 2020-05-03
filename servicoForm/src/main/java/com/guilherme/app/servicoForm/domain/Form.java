package com.guilherme.app.servicoForm.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "TB_FORM")
@Getter
@Setter
public class Form {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tb_form_id_form_seq")
    @SequenceGenerator(name = "tb_form_id_form_seq", sequenceName = "tb_form_id_form_seq", allocationSize = 1 )
    @Column(name = "ID_FORM")
    private Long id;

    @Column(name = "DS_NAME_FORM", length = 35)
    private String nameForm;

    @Column(name = "DS_FORM_DESCRIPTION")
    private String descriptionForm;

    @Column(name = "NU_TIME")
    private Long time;

    @ManyToOne
    @JoinColumn(name = "ID_USER")
    private User user;
}
