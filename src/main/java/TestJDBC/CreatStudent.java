package TestJDBC;

import Model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreatStudent {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
        Session session = factory.getCurrentSession();

        try{
            Student student = new Student("kia" , "shamaei" , "kia@gmail.com");
            session.beginTransaction() ;
            session.save(student);
            session.getTransaction().commit();

        }finally{
            factory.close();

        }
    }
}
