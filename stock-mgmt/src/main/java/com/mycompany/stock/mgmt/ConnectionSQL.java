
package com.mycompany.stock.mgmt;
import java.sql.*;
import java.sql.DriverManager;

public class ConnectionSQL {
    public static void main(String [] args) {
        try{
           Class.forName("com.microsoft.sqlserver.jdb.SQLServerDriver");
           Connection.con = DriverManager.getDriver("jdbc:sqlserver://localhost:1433;databaseName =stockmanagment;user = root;password=1234" );
           Statement stmt = con.createStatement();
           ResultSet rs = stmt.executeQuery("Selct *from vendor");
           while(rs.next())
               System.out.println();
           con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
                
        }
    }
            

