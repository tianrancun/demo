package com.example.demo.mapper;

import com.example.demo.metadata.Direction;
import com.example.demo.metadata.ReversalFlay;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Serializable {
    private static final long serialVersionUID = 4346092911489022673L;

    private Integer id;
    private String name;
    private Integer age;
    private Direction direction;

    @JsonDeserialize(converter = ReversalFlay.Converter.class)
    private ReversalFlay reversalFlay;

    public Person(Integer id, String name, Integer age, Integer gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    /**
     * 1 男，0 女
     */
    private Integer gender;

    @JsonDeserialize(using = GenderJsonDeserializer.class)
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    @JsonSerialize(using = GenderJsonSerializer.class)
    public Integer getGender() {
        return gender;
    }
}
