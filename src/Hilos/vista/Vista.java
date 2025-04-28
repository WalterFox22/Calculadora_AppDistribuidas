package Hilos.vista;

import Hilos.clase.ProcesoF;

import javax.swing.*;
import java.awt.*;

public class Vista extends JFrame {
    private JTextField valor1;
    private JTextField valor2;
    private JTextField valor3;
    private JButton procesar;
    private JLabel Txt1;
    private JPanel Txt2;
    private JLabel Txt3;

    public Vista() {
        setTitle("Captura de Datos");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Componentes
        Txt1 = new JLabel("Ingrese la marca:");
        valor1 = new JTextField(10);
        JLabel txt2Label = new JLabel("Ingrese el modelo:");
        valor2 = new JTextField(10);
        Txt3 = new JLabel("Ingrese el precio:");
        valor3 = new JTextField(10);
        procesar = new JButton("Procesar");
        Txt2 = new JPanel(new GridLayout(4, 2, 5, 5));

        // Añadir componentes al panel
        Txt2.add(Txt1);
        Txt2.add(valor1);
        Txt2.add(txt2Label);
        Txt2.add(valor2);
        Txt2.add(Txt3);
        Txt2.add(valor3);
        Txt2.add(new JLabel()); // espacio vacío
        Txt2.add(procesar);

        add(Txt2);

        // Acción del botón
        procesar.addActionListener(e -> {
            String marca = valor1.getText();
            String modelo = valor2.getText();
            double precio;

            try {
                precio = Double.parseDouble(valor3.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "El precio debe ser un número válido.");
                return;
            }

            // Iniciar hilo con los valores capturados
            ProcesoF proceso = new ProcesoF(marca, modelo, precio);
            new Thread(proceso).start();
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Vista::new);
    }
}
