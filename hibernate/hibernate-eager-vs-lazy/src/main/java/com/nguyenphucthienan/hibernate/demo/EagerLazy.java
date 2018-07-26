package com.nguyenphucthienan.hibernate.demo;

import com.nguyenphucthienan.hibernate.entity.Course;
import com.nguyenphucthienan.hibernate.entity.Instructor;
import com.nguyenphucthienan.hibernate.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EagerLazy {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();

            int instructorId = 1;
            Instructor instructor = session.get(Instructor.class, instructorId);

            System.out.println(instructor);

            // Resolve lazy loading issue
            // Option 1: Call getter method while session is open
            System.out.println(instructor.getCourses());

            // Close the session
            session.getTransaction().commit();
            session.close();

            // Get lazy data when the session was closed
            System.out.println(instructor.getCourses());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Handle connection leak issue
            session.close();
            factory.close();
        }
    }
}
