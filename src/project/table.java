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
public class table {

    public static void table() {
        Connection connection = null;
        Statement statement = null;

        try {
            connection = (Connection) DBConnection.getconConnection();
            statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS USERS(UserID int(10) NOT NULL AUTO_INCREMENT,Name varchar(200),email varchar(100),Address varchar(500), password varchar(100),status varchar(200),PRIMARY KEY (UserID))");
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS rooms(RoomID varchar(50), RoomType varchar(100),BedType varchar(100),Price int(50), status varchar(100))");
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS Customer(CusID int(20) NOT NULL AUTO_INCREMENT, Cus_Name varchar(100),Cus_Address varchar(200),Mobile int(20),Age int(3),Email varchar(100),Gender varchar(10),NIC varchar(100),PRIMARY KEY (CusID))");
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS reservation (ResID int(20) NOT NULL AUTO_INCREMENT, DATE VARCHAR(20), TIME VARCHAR(20),NIC varchar(100),ROOMID INT(20), PAYMENT VARCHAR(20), PRIMARY KEY (ResID))");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                connection.close();
                statement.close();
            } catch (Exception e) {
            }
        }

    }

}
