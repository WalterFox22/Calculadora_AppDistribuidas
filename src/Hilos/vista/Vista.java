package Hilos.vista;

import Hilos.clase.ProcesoF;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Vista extends JFrame {
    private JTextField marca;
    private JTextField modelo;
    private JTextField precio;
    private JButton procesar;
    private JLabel txt1;
    private JLabel txt2;
    private JLabel txt3;

    public Vista() {
        // Configurar ventana
        setTitle("Ingreso de Autos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 250);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 3, 3));

        // Crear componentes
        txt1 = new JLabel("Marca:");
        txt2 = new JLabel("Modelo:");
        txt3 = new JLabel("Precio:");
        marca = new JTextField();
        modelo = new JTextField();
        precio = new JTextField();
        procesar = new JButton("Procesar");

        // Agregar componentes a la ventana
        add(txt1);
        add(marca);
        add(txt2);
        add(modelo);
        add(txt3);
        add(precio);
        add(new JLabel()); // Espacio vacío
        add(procesar);

        // Acción del botón
        procesar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String m = marca.getText();
                String mo = modelo.getText();
                double p;
                try {
                    p = Double.parseDouble(precio.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Precio inválido", "Error", JOptionPane.ERROR_MESSAGE);
                    dispose();
                    return;
                }

                ProcesoF proceso = new ProcesoF(m, mo, p);
                Thread hilo = new Thread(proceso);
                hilo.start();
                dispose();
            }
        });

        setVisible(true);
    }

    // Método principal para correr
    public static void main(String[] args) {
        new Vista();
    }
}
