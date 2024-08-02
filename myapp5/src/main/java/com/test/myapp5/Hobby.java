package com.test.myapp5;

import org.springframework.stereotype.Component;

@Component
public class Hobby {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
