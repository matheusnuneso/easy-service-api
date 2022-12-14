package com.easyserviceapi.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "TB_PERSON")
@Entity
@SequenceGenerator(name = "seq", initialValue = 10)
@Data
public class PersonModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "seq")
    private Long id;

    @Column(nullable = false, length = 70)
    private String fullName;

    @Column(nullable = false, length = 40)
    private String email;

    @Column(nullable = false, length = 14)
    private String cpf;

    @Column(nullable = false, length = 70)
    private String userName;

    @Column(nullable = false, length = 10)
    private String password;

}

/*Person
- id
- userName
- password
- fullName
- email
- cpf
- idUser (da tbl User)

Job
- id
- title
- price
- idPerson (da tbl Person)

JobSigned
- id
- idJob (da tbl Job)
- finalPrice
- idClient (da tbl Person)
- idProvider (da tbl Person) */