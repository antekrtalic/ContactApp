package com.ceki.demo.jsspringboot.dto;

import lombok.Getter;
import lombok.Setter;

public class CreateContactPostResponse {

    private @Getter @Setter int id;
    private @Getter @Setter String firstName;
    private @Getter @Setter String lastName;
    private @Getter @Setter String company;

    public CreateContactPostResponse(int id, String firstName, String lastName, String company) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
    }
}
