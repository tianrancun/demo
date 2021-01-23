package com.example.demo.controller;

import com.example.demo.mapper.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
@RestController
@Slf4j
public class PersonController {
    // 使用集合模拟数据库中数据存储
    private List<Person> persons = new ArrayList<>();

    // 用于初始化数据，@PostConstruct 注解标注的方法，在构造器执行之后自动执行，只会执行一次
    @PostConstruct
    public void init() {
        persons.add(new Person(1, "张三", 18, 1));
        persons.add(new Person(2, "李四", 33, 0));
    }

    @PostMapping("/save")
    public Person savePerson(@RequestBody Person person) {
        log.info("【 PersonController.savePerson() 】  person ===> " + person);
        persons.add(person);
        log.info("集合内容为 ===> " + persons);
        return person;
    }

    @GetMapping("/find")
    public Person findPersonById(Integer id) {
        Person p = null;
        for (Person person : persons) {
            if (person.getId().equals(id)) {
                p = person;
                log.info("【 PersonController.findPersonById() 】  查询结果为：person ===> " + person);
            }
        }
        return p;
    }
}
