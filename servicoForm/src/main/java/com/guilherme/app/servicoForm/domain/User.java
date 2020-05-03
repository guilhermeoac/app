package com.guilherme.app.servicoForm.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "TB_USER")
@Getter
@Setter
public class User implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tb_user_id_user_seq")
    @SequenceGenerator(name = "tb_user_id_user_seq", sequenceName = "tb_user_id_user_seq", allocationSize = 1 )
    @Column(name = "ID_USER")
    private Long id;

    @Column(name = "DS_USER")
    private String login;

    @Column(name = "DS_PASSWORD")
    private String password;

    @Column(name = "NU_RANK")
    private Long ranking;
}
