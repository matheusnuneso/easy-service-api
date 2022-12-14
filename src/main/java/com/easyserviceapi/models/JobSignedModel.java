package com.easyserviceapi.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "TB_JOB_SIGNED")
@Entity
@SequenceGenerator(name = "seq" , initialValue = 10)
@Data
public class JobSignedModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "seq")
    private Long id;
    
    @Column(nullable = false)
    private long idJob;

    @Column(nullable = false)
    private double finalPrice;
    
    @Column(nullable = false)
    private long idClient;
        
    @Column(nullable = false)
    private long idPerson;

    @Column(nullable = false)
    private Date jobDate;
    
    @Column(nullable = false)
    private Date contractDate;
}