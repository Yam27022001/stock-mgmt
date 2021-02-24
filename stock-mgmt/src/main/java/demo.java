
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class demo {
    public static void main(String args[]){
        String url = "jdbc:mysql://localhost:3306/stockmanagment";
        String user = "root";
        String password = "1234";
        try{
        Class.forName("com.mysql.jdbc.Driver");
         Connection connection =DriverManager.getConnection(url, user, password);
         System .out.println("Connetcion is Succcessful to the database"+ url);
      }catch(ClassNotFoundException e){
          e.printStackTrace();
      }catch(SQLException throwables) {
          throwables.printStackTrace();
        
    }
        
    }
    
}
