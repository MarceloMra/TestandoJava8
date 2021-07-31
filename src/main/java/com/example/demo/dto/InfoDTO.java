package com.example.demo.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor

public class InfoDTO implements Serializable {
    private String name;
    private String description;

}
