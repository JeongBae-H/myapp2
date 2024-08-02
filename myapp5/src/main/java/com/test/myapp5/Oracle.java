package com.test.myapp5;

import org.springframework.stereotype.Component;

@Component
public class Oracle implements Database{
    @Override
    public void open() {
        System.out.println("Oracle Open");
    }
}
