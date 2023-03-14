package com.example.Hibernatepart1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestEmployee {
    public static void main(String[] args) {
        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        Session session =sessionFactory.openSession();
        session.beginTransaction();

      Employee employee =new Employee("rajdhar",23);
      session.save(employee);
      session.getTransaction().commit();
      session.close();
    }
}
