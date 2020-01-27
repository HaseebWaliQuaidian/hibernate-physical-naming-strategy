package com.haseeb.hibernate.demo.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class User implements Serializable {

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private int Id;
    private String firstName;
    private String lastName;

    public User(){} //No-arg constructor

    public User(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
