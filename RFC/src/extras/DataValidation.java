/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author Diego
 */
public class DataValidation {
    public int string2Int(String value){
        int result = 0;
        try{
            result = Integer.parseInt(value);
            
        }catch(NumberFormatException err){
            JOptionPane.showMessageDialog(null, "Error al convertir el valor");
            
            result = 0;
        }
        return result;
    }
}
