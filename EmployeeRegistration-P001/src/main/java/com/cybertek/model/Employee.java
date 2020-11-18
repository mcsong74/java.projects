package com.cybertek.model;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employee {
    private String firstName;
    private String lastName;
    private String birthday;
    private int age;
    private String email;
    private String password;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zip;
}
