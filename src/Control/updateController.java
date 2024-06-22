/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author Chamilka
 */
public class updateController {
    
    public void update(int id, String name, int age, int grade){
        
        new Model.update().updateData(id, name, age, grade);
        
    
    }
    
}
