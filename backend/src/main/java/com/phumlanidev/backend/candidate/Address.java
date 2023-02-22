package com.phumlanidev.backend.candidate;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue
    private Long address_id;
    private String streetName;
    private String zipCode;
    private String city;
    private String province;
    private String country;
    @ManyToOne
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;
}
