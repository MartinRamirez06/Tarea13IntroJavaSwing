package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaSwing extends JFrame {

    private JLabel etiquta1;
    private JTextField txtGrados;
    private JButton boton;
    private JLabel lblResultados;
    private FlowLayout layout;

    public VentanaSwing(String title) throws HeadlessException {
        super(title);
        this.setSize(800,600);
        layout=new FlowLayout();
        this.getContentPane().setLayout(layout);
        etiquta1=new JLabel("Grados C.");
        this.getContentPane().add(etiquta1);
        txtGrados=new JTextField(10);
        this.getContentPane().add(txtGrados);
        boton=new JButton("Convertir");
        this.getContentPane().add(boton);
        lblResultados=new JLabel("0.0 ªF");
        this.getContentPane().add(lblResultados);

        //Eventos
        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double centigrados= Double.parseDouble(txtGrados.getText());
                double farenheid=(centigrados * 9.0/5.0)+32.0;
                lblResultados.setText(farenheid +" ªF");

            }
        });

        //Para que se cierre correctamente la ventana
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                JOptionPane.showMessageDialog(null,"Adios...");
                System.exit(0);
            }
        });
        //Para que se vea
        this.setVisible(true);
    }

}
