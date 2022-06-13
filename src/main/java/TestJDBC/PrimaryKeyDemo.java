package TestJDBC;

import Model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class PrimaryKeyDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();
        try{
            Student student1 = new Student("kia1" , "shamaei" , "kia1@gmail.com");
            Student student2 = new Student("kia2" , "shamaei" , "kia2@gmail.com");
            Student student3 = new Student("kia3" , "shamaei" , "kia3@gmail.com");
            session.beginTransaction();

            session.save(student1);
            session.save(student2);
            session.save(student3);

            session.getTransaction().commit();
        }finally {
            factory.close();
        }
    }
}
