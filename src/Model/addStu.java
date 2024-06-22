/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Chamilka
 */
public class addStu {
    
    
    Connection con = null;
    PreparedStatement pst = null;
    
    public void student(String name, int age, int grade){
   con = DBconnect.connect();
        
        try {
            String sqlquery = "INSERT INTO student(name, age, grade) VALUES (?, ?, ?)";
            pst = con.prepareStatement(sqlquery);
          
            pst.setString(1, name);
            pst.setFloat(2, age);
            pst.setInt(3, grade);          
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Insert SUCCESSFULY");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
}
}
    
}
