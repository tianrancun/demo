package com.example.demo.mapper;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
    private String name;
    private String age;
    private int score;

    public Student(String name, String age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }
}
