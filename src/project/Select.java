/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author neths
 */
public class Select {
    public static ResultSet getData(String Query){
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
        try {
            connection = DBConnection.getconConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(Query);
            return resultSet;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    } 
        
    
}
