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
public class update {
     Connection con = null;
    PreparedStatement pst = null;
    
    public void updateData(int id, String name, int age, int grade){
         con = DBconnect.connect();
        
         
         try{
            String sql = "UPDATE student SET name='"+name+"', age='"+age+"', grade='"+grade+"' WHERE id='"+id+"'";
            pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated!");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NotUpdated!");
        }
    }
    
    
    
}
