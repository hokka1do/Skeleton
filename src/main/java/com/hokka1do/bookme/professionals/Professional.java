package com.hokka1do.bookme.professionals;

import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;

@Entity
@Table
public class Professional {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @GetMapping("/getLastName")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String lastName;
}
