/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import jdk.nashorn.internal.objects.NativeDebug;

/**
 *
 * @author dmorenoar
 */
public class LINKIA_1819_M03_UF4_C07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        //Creamos la instancia del objeto de la clase (JFrame)
        Principal principal = new Principal();
        principal.setSize(800, 600);

        //Que no se redimensione
        principal.setResizable(false);

        //Centraría la pantalla JFRame
        principal.setLocationRelativeTo(null);

        /*HACER TODOS LOS CAMBIOS PREVIOS ANTES DE MOSTRARLO*/
        principal.setVisible(true);
    }

}
