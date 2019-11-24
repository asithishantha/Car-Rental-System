/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseconnect;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;


public class dbconnect {
    

    public static Connection connect()
    {
        Connection conn =null;
        
        try 
        {
           Class.forName("com.mysql.jdbc.Driver") ;
           conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/car_rental","root","");
           
        } 
        catch (Exception e)
        {
         System.out.println();
        }
        
    return conn;
    }
    
}
