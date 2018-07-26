package com.nguyenphucthienan.hibernate.demo;

import com.nguyenphucthienan.hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteStudent {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();
            int studentId = 1;
            Student student = session.get(Student.class, studentId);
            session.delete(student);
            session.getTransaction().commit();

            session = factory.getCurrentSession();
            session.beginTransaction();
            session.createQuery("delete from Student where id=2").executeUpdate();
            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
