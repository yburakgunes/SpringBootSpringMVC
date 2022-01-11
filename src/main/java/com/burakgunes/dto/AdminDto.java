package com.burakgunes.dto;

import lombok.*;
import lombok.extern.log4j.Log4j2;

import java.io.Serial;
import java.io.Serializable;

@Log4j2
@ToString
@EqualsAndHashCode
@Builder

public class AdminDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 1094263456008609870L;

    @Getter
    @Setter
    private String adminName;

    @Getter
    @Setter
    private String adminLastName;

    public AdminDto() {
        this.adminName="admin ismi nerde ha nerde?!";
        this.adminLastName="admin soyadı da yok?";
    }

    public AdminDto(String adminName, String adminLastName) {
        this.adminName = adminName;
        this.adminLastName = adminLastName;
    }
}
