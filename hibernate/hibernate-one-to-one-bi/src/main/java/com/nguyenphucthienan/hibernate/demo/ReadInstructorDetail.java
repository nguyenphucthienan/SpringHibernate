package com.nguyenphucthienan.hibernate.demo;

import com.nguyenphucthienan.hibernate.entity.Instructor;
import com.nguyenphucthienan.hibernate.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadInstructorDetail {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();

            int instructorDetailId = 1;
            InstructorDetail instructorDetail = session.get(InstructorDetail.class, instructorDetailId);

            if (instructorDetail != null) {
                System.out.println("instructorDetail: " + instructorDetail);
                System.out.println("instructor: " + instructorDetail.getInstructor());
            }

            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Handle connection leak issue
            session.close();
            factory.close();
        }
    }
}
