package com.wellsfargo.counselor.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Advisor{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long advisorId;
    private String name;
    private String contactInfo;

    public Advisor() {
    }

    public Advisor(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }

    // Getters and setters

    public Long getAdvisorId() {
        return advisorId;
    }

    public void setAdvisorId(Long advisorId) {
        this.advisorId = advisorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
}
