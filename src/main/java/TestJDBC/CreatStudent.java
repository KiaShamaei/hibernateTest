package TestJDBC;

import Model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreatStudent {
    public static void main(String[] args) {
        //create session factory
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
        //create session
        Session session = factory.getCurrentSession();

        try{
            //use the session object to save java Object
            Student student = new Student("kia4" , "shamaei" , "kia@gmail.com");
            //start a transaction
            session.beginTransaction() ;
            //save the student object
            session.save(student);
            System.out.println("save the student ...");
            //commit transaction
            session.getTransaction().commit();

        }finally{
            factory.close();

        }
    }
}
