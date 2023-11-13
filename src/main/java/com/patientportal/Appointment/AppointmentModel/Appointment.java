package com.patientportal.Appointment.AppointmentModel;

//import jakarta.validation.constraints.Pattern;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
////import javax.validation.constraints.Pattern;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Pattern;

@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String reason;

    private Boolean insuranceChange;

    @Pattern(regexp = "^\\d{3}-\\d{3}-\\d{4}$", message = "Invalid phone number format. It should be in the format XXX-XXX-XXXX.")
    private String phoneNumber;

    // Constructors

    public Appointment() {
    }

    public Appointment(String reason, Boolean insuranceChange, String phoneNumber) {
        this.reason = reason;
        this.insuranceChange = insuranceChange;
        this.phoneNumber = phoneNumber;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Boolean getInsuranceChange() {
        return insuranceChange;
    }

    public void setInsuranceChange(Boolean insuranceChange) {
        this.insuranceChange = insuranceChange;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}