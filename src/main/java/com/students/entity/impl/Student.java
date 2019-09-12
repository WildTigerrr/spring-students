package com.students.entity.impl;

import com.students.entity.Subject;
import com.students.entity.Teacher;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Slf4j
@Getter
@Setter
@Component
@ComponentScan
public class Student {

    @Value("${student.age}")
    private int age;
    @Value("${student.name}")
    private String name;
    private Teacher teacher;
    @Value("#{${student.grades}}")
    private Map<String, Integer> grades;
    private List<Subject> subjects;

    public Student() {
    }

    @Autowired
    public Student(Teacher teacher) {
        this.teacher = teacher;
    }

    @Autowired
    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public void study() {
        log.info("I'm " + getName());
        log.info("I study with teacher " + getTeacher().getName() + ", this subjects:");
        for (Subject subject : subjects) {
            log.info(subject.getName() + ", and have these mark: " + grades.get(subject.getName()));
        }
    }

}
