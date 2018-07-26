package com.nguyenphucthienan.hibernate.demo;

import com.nguyenphucthienan.hibernate.entity.Instructor;
import com.nguyenphucthienan.hibernate.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateInstructor {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            Instructor instructor = new Instructor("John", "Doe", "johndoe@email.com");
            InstructorDetail instructorDetail =
                    new InstructorDetail("https://www.youtube.com", "reading");
            instructor.setInstructorDetail(instructorDetail);

            session.beginTransaction();

            // NOTE: This will also save the instructorDetail object because of CascadeTye.ALL
            session.save(instructor);

            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
