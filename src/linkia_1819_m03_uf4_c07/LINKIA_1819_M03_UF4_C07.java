/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkia_1819_m03_uf4_c07;

import java.awt.Toolkit;

/**
 *
 * @author dmorenoar
 */
public class LINKIA_1819_M03_UF4_C07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creamos la instancia del objeto de la clase (JFrame)
        Principal principal = new Principal();
        principal.setSize(800,600);
        
        //Que no se redimensione
        principal.setResizable(false);
        
        //Centraría la pantalla JFRame
        principal.setLocationRelativeTo(null);
      
        //Ponemos un icono a nuestra aplicación
        principal.setIconImage(Toolkit.getDefaultToolkit().getImage("icon.png"));
        
        /*HACER TODOS LOS CAMBIOS PREVIOS ANTES DE MOSTRARLO*/
        principal.setVisible(true);
    }
    
}
