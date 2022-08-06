package com.example.demo.entity;

import lombok.Data;
import javax.persistence.Id;

import javax.persistence.Entity;

@Entity
@Data
public class Payment {
    @Id
    private Integer id;
    private String serial;
}

