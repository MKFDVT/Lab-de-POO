/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controles;
import java.sql.*;
/**
 *
 * @author 52812
 */
class DBConnection {
    public Connection getConnected() throws ClassNotFoundException, SQLException{
     // create our mysql database connection 
        String myDriver = "com.mysql.cj.jdbc.Driver"; 
        String myUrl = "jdbc:mysql://localhost:3306/libro";
        Class.forName(myDriver);
        Connection conn = DriverManager.getConnection(myUrl, "root", "Mysql.123");

        return conn;
    }
    
}
