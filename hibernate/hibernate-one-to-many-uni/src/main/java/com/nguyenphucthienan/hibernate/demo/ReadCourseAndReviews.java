package com.nguyenphucthienan.hibernate.demo;

import com.nguyenphucthienan.hibernate.entity.Course;
import com.nguyenphucthienan.hibernate.entity.Instructor;
import com.nguyenphucthienan.hibernate.entity.InstructorDetail;
import com.nguyenphucthienan.hibernate.entity.Review;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadCourseAndReviews {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Review.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();

            int courseId = 10;
            Course course = session.get(Course.class, courseId);

            System.out.println(course);
            System.out.println(course.getReviews());

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
