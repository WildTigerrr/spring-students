package com.students.entity.impl.subject;

import com.students.entity.Subject;
import org.springframework.stereotype.Component;

@Component
public class Art implements Subject {
    @Override
    public String getName() {
        return "Art";
    }
}
