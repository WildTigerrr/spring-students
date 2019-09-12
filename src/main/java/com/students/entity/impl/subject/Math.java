package com.students.entity.impl.subject;

import com.students.entity.Subject;
import org.springframework.stereotype.Component;

@Component
public class Math implements Subject {
    @Override
    public String getName() {
        return "Math";
    }
}
