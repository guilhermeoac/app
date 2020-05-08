package com.guilherme.app.servicoForm.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "RL_ANSWER_FORM")
@Getter
@Setter
public class Answer implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tb_user_id_user_seq")
    @SequenceGenerator(name = "tb_user_id_user_seq", sequenceName = "tb_user_id_user_seq", allocationSize = 1 )
    @Column(name = "ID_ANSWER_FORM")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_USER")
    private User user;

    @ManyToOne
    @JoinColumn(name = "ID_FORM")
    private Form form;
}
