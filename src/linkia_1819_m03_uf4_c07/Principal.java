/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkia_1819_m03_uf4_c07;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author dmorenoar
 */
public class Principal extends JFrame {

    JTextField txtUser;
    JComboBox tipo;
    JRadioButton radioHombre;
    JRadioButton radioMujer;
    JCheckBox checkFantasia;
    ButtonGroup bgSex;

    //Constructor de la ventana por defecto
    public Principal() {

        //Tenemos que decirle que el no nos autoajuste las posiciones
        getContentPane().setLayout(null);

        //Decirle a la ventana que al cerrar finalize el programa
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /*CREAR UN JLABEL*/
        JLabel lblBienvenida = new JLabel("Bienvenido");
        //Definir el tamaño de nuestro JLabel
        lblBienvenida.setBounds(360, 100, 80, 14);
        getContentPane().add(lblBienvenida);

        /*CREAR UN JLABEL*/
        JLabel lblUser = new JLabel("USUARIO");
        //Definir el tamaño de nuestro JLabel
        lblUser.setBounds(280, 200, 80, 14);
        getContentPane().add(lblUser);

        /*CREAR UN TEXTFIELD*/
        txtUser = new JTextField();
        txtUser.setBounds(360, 200, 80, 14);
        getContentPane().add(txtUser);

        /*CREAR UN SELECTBOX - COMBOBOX*/
        tipo = new JComboBox();
        tipo.setModel(new DefaultComboBoxModel(new String[]{"Fantasía", "Terror", "Sci-fi"}));
        tipo.setBounds(360, 240, 91, 20);
        getContentPane().add(tipo);

        /*CREAR UN RADIO BUTTON*/
        radioHombre = new JRadioButton("Hombre");
        radioHombre.setBounds(360, 280, 91, 20);
        getContentPane().add(radioHombre);

        radioMujer = new JRadioButton("Mujer");
        radioMujer.setBounds(360, 300, 91, 20);
        getContentPane().add(radioMujer);

        /*Crear un conjunto de botones*/
        bgSex = new ButtonGroup();
        bgSex.add(radioMujer);
        bgSex.add(radioHombre);

        /*CREAR UN CHECKBOX*/
        checkFantasia = new JCheckBox("Fantasia");
        checkFantasia.setBounds(360, 340, 91, 20);
        getContentPane().add(checkFantasia);

        /*Crear un botón*/
        JButton btnClick = new JButton("Aceptar");
        btnClick.setBounds(360, 360, 91, 20);
        btnClick.addActionListener(new btnAction());
        getContentPane().add(btnClick);

    }

    private class btnAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Me han clickado");

            /*COMPROBAR LO QUE ITNRODUCE EL USUARIO*/
            if (txtUser.getText().isEmpty()) {
                System.out.println("Esta vacío");
            } else {
                System.out.println("Esta lleno");
            }

            System.out.println(tipo.getSelectedItem());
            System.out.println(radioHombre.isSelected());

            /*LLAMAMOS A LA VENTANA AUXILIAR*/
            VentanaAuxiliar v = new VentanaAuxiliar("TODO OK");
            v.setSize(200, 200);

            //Que no se redimensione
            v.setResizable(false);

            //Centraría la pantalla JFRame
            v.setLocationRelativeTo(null);
            v.setVisible(true);

        }

    }

}
