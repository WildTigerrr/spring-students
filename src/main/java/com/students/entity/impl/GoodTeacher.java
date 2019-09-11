package com.students.entity.impl;

import com.students.entity.Teacher;
import org.springframework.stereotype.Component;

@Component
public class GoodTeacher implements Teacher {
    @Override
    public String getName() {
        return "Johnny";
    }
}
