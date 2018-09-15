/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import views.ViewRfc;
import models.ModelRfc;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import extras.DataValidation;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego
 */
public class ControllerRfc {
    
    ViewRfc viewRfc;
    ModelRfc modelRfc;
    DataValidation dv;
    MouseListener ml = new MouseListener(){
        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getSource() == viewRfc.jb_calcular){
                calcular();
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            
        }

        @Override
        public void mouseExited(MouseEvent e) {
            
        }
    };
    public void Datos(){
        if(viewRfc.jtf_nombre.getText().isEmpty() || viewRfc.jtf_apep.getText().isEmpty() || viewRfc.jtf_apem.getText().isEmpty() ){
            JOptionPane.showMessageDialog(viewRfc,"Debe agregar valores!");
        }
        else{
            modelRfc.setApep(viewRfc.jtf_apep.getText());
            modelRfc.setApem(viewRfc.jtf_apem.getText());
            modelRfc.setNombre(viewRfc.jtf_nombre.getText());
            modelRfc.setDia_n(viewRfc.jcb_dn.getSelectedItem().toString());
            modelRfc.setMes_n(viewRfc.jcb_mn.getSelectedItem().toString());
            modelRfc.setAnio_n(viewRfc.jcb_an.getSelectedItem().toString());
           
        }
    }
    public void calcular(){
        Datos();
        String apep = modelRfc.getApep().trim().toUpperCase().substring(0,2);
        String apem = modelRfc.getApem().trim().toUpperCase().substring(0,1);
        String nombre = modelRfc.getNombre().trim().toUpperCase().substring(0,1);
        String dia_n = modelRfc.getDia_n();
        String mes_n = modelRfc.getMes_n();
        String anio_n = modelRfc.getAnio_n().trim().substring(2, 4);
        viewRfc.jl_rfc.setText("RFC: "+ apep.concat(apem).concat(nombre).concat(dia_n).concat(mes_n).concat(anio_n));
    }
    public ControllerRfc(ViewRfc viewRfc, ModelRfc modelRfc) {
        this.viewRfc = viewRfc;
        this.modelRfc = modelRfc;
        this.viewRfc.jb_calcular.addMouseListener(ml);
        initComponents();
    }
    
    private void initComponents(){
        viewRfc.setVisible(true);
    }
    
}
