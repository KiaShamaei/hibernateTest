package TestJDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/hbstudent?useSSL=false";
        String user = "root";
        String pass = "123456";

        try{
            System.out.println("this is for connection ...");
            Connection myconnect = DriverManager.getConnection(jdbcUrl , user , pass);
            System.out.println("table is connected  ...");

        }catch (Exception exp){
            exp.printStackTrace();
        }




    }
}
