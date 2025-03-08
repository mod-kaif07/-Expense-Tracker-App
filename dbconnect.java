/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author moham
 */
public class dbconnect {
    public static Connection c,c1;
    public static Statement  st;
    static {
        try{
            //Class.forName("com.mysql.cj.jdbc.Driver");
           c= DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/spendingdb?useSSL=false", "root", "Mohammadkaif@7860");
      /*c = DriverManager.getConnection(
    "jdbc:mysql://192.168.242.68:3306/spendingdb?useSSL=false", "root", "7860");*/
            st=c.createStatement();
        } catch(Exception ex){
           JOptionPane.showMessageDialog(null, ex);
       }   
    }
    
}
