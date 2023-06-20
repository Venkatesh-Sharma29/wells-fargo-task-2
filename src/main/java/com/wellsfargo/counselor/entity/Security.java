package com.wellsfargo.counselor.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Security {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long securityId;
    private String name;
    private String category;
    private Date purchaseDate;
    private double purchasePrice;
    private int quantity;

    @ManyToOne
    private Portfolio portfolio;

    public Security() {

