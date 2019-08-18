package logexpress;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LogExpress {
    
     private static Connection conn;

    public static void main(String[] args) throws ClassNotFoundException {
        
        try {           
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/logexpress","root","root");
        }
            catch (SQLException ex){
                    System.out.println("Erro" + ex.getMessage());
            } 
        
        Login P = new Login(conn);
        P.setTitle("   ***   LOGEXPRESS - LOGIN   ***");
        P.setVisible(true);

    }
}
