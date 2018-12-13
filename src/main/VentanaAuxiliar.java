/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JDialog;
import javax.swing.JLabel;

/**
 *
 * @author dmorenoar
 */
public class VentanaAuxiliar extends JDialog {
    
    public VentanaAuxiliar(String mensaje) { 
    
        JLabel texto = new JLabel(mensaje);
        texto.setBounds(120,120,91,20);
        getContentPane().add(texto);
    }
    
}
