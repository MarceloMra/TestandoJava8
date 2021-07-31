package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Bean;

import java.beans.JavaBean;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Info {
    private String name;
    private String description;

    @Override
    public boolean equals(Object o){
        Info info = (Info) o;
        return (info.getName().equals(this.getName()) && info.getDescription().equals(this.getDescription())) ? true : false;
    }
}
