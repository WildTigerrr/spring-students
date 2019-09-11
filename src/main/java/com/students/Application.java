package com.students;

import com.students.entity.impl.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

@Slf4j
public class Application {

    public static void main(String[] args) {
        initByAnnotations();
        log.info("");
        initByXml();
    }

    private static void initByAnnotations() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(StudentConfiguration.class);
        Student student = ctx.getBean(Student.class);
        log.info("Studying with Annotations:");
        student.study();
    }

    private static void initByXml() {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/students.xml");
        ctx.refresh();

        Student student = (Student) ctx.getBean("studentByType");
        log.info("Studying with Xml:");
        student.study();

        ctx.close();
    }

}
