package com.nguyenphucthienan.hibernate.demo;

import com.nguyenphucthienan.hibernate.entity.Course;
import com.nguyenphucthienan.hibernate.entity.Instructor;
import com.nguyenphucthienan.hibernate.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class EagerLazyFetchJoin {
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

            // Resolve lazy loading issue
            // Option 2: Hibernate query with HQL
            int instructorId = 1;
            Query<Instructor> query =
                    session.createQuery("select instructor from Instructor instructor " +
                                    "JOIN FETCH instructor.courses" +
                                    " where instructor.id=:instructorId",
                            Instructor.class);

            query.setParameter("instructorId", instructorId);
            Instructor instructor = query.getSingleResult();

            System.out.println(instructor);

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
