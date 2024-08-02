package com.test.myapp5;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// 캡슐화, 다형성, 상속성, 형번환(값타입 형변환, 참조타입 형변환)
@Component
@Primary
public class Oracle implements Database{
    @Override
    public void open() {
        System.out.println("Oracle Open");
    }
}