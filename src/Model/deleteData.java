/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Chamilka
 */
public class deleteData {
    Connection con = null;
    PreparedStatement pst = null;
    
    public void delete(int id){
        con = DBconnect.connect();
        
         try {
                String sql = "DELETE FROM student WHERE id='"+id+"'";
                pst = con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Deleted");
            }catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Not Deleted");
            }
        
    }
    
    
    
}
