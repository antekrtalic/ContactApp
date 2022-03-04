package com.ceki.demo.jsspringboot.dto;

import lombok.Getter;
import lombok.Setter;

public class CreateContactPostRequest {

    private @Getter @Setter String firstName;
    private @Getter @Setter String lastName;
    private @Getter @Setter String company;
}
