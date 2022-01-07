package com.practise.streams;

import lombok.Getter;
import lombok.Setter;

public class Employee {

    @Setter @Getter
    String firstName;

    String lastName;

    int id;


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
