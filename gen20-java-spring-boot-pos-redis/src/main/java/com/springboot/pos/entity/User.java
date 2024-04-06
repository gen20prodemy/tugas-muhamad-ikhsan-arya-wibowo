package com.springboot.pos.entity;

import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity
@Table (name = "userTable")
public class User {
    @Id
    @SequenceGenerator(
            name = "seq_user",
            sequenceName = "seq_user",
            allocationSize = 1,
            initialValue = 6
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "seq_user"
    )
    @Column(
            name = "id",
            updatable = true
    )
    private int id;
    @Column(
            name = "firstName",
            nullable = true
    )
    private String firstName;
    @Column(
            name = "lastName",
            nullable = true
    )
    private String lastName;
    @Column(
            name = "email",
            nullable = true
    )
    private String email;
    @Column(
            name = "address",
            nullable = true
    )
    private String address;

    public int getId() {
        return id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User(String firstName, String lastName, String email, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
    }

    public User(){}

}
