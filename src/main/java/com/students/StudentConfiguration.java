package com.students;

import com.students.entity.Subject;
import com.students.entity.impl.subject.Art;
import com.students.entity.impl.subject.Economic;
import com.students.entity.impl.subject.Math;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@ComponentScan
@PropertySource("classpath:values.properties")
public class StudentConfiguration {

    @Bean
    public List<Subject> getSubjects() {
        List<Subject> subjects = new ArrayList<>();
        subjects.add(new Math());
        subjects.add(new Art());
        subjects.add(new Economic());
        return subjects;
    }

}
