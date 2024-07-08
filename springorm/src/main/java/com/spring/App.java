package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.com.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // System.out.println( "Hello World!" );

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao = context.getBean("stuedntDao", StudentDao.class);
        Student student = new Student(123, "monika", "bhopal");

        int r = studentDao.insert(student);
        System.out.println("done " + r);

    }
}
