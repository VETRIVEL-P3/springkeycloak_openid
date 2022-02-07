package com.example.springkeycloak.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="keyc")
public class springkeycloak {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String dept;
}
