package com.test.myapp5;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private String name;
    private Hobby hobby;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Hobby getHobby() {
        return hobby;
    }
    public void setHobby(Hobby hobby) {
        this.hobby = hobby;
    }
}
