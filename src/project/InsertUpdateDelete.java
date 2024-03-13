/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author neths
 */
public class InsertUpdateDelete {
    public static void setData(String Query, String msg) {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DBConnection.getconConnection();
            statement =connection.createStatement();
            statement.executeUpdate(Query);
            if(!msg.equals(""))
                JOptionPane.showMessageDialog(null ,msg);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
        
        finally{
             try {
            
        } catch (Exception e) {
            
        }
        }
    }
    
}
