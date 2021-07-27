package com.example.model;

import javax.persistence.Entity;

@Entity
public class InheritedUser extends User {

    public InheritedUser() {
    }

    public InheritedUser(String firstName, String lastName) {
        super(firstName, lastName);
    }
}
