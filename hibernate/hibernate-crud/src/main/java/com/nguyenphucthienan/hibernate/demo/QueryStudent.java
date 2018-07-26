package com.nguyenphucthienan.hibernate.demo;

import com.nguyenphucthienan.hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class QueryStudent {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();

            List<Student> students = session.createQuery("from Student").getResultList();
            displayStudents(students);

            students = session.createQuery("from Student student where " +
                    "student.firstName = 'John'").getResultList();
            displayStudents(students);

            students = session.createQuery("from Student student where " +
                    "student.firstName = 'John' OR student.firstName='Jane'").getResultList();
            displayStudents(students);

            students = session.createQuery("from Student student where " +
                    "student.email LIKE '%@email.com'").getResultList();
            displayStudents(students);

            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }

    private static void displayStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
