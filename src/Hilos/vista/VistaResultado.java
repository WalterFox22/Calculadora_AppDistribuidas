package Hilos.vista;

import javax.swing.*;
import java.awt.*;

public class VistaResultado extends JFrame {
    private JLabel titulo;
    private JLabel cuerpoTexto;

    public VistaResultado(String mensaje) {
        setTitle("Resultado");
        setSize(350, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        // Crear componentes

        titulo = new JLabel("Información Procesada", SwingConstants.CENTER);
        cuerpoTexto = new JLabel(
                "<html><div style='text-align:center;'>" +
                        mensaje.replace("\n", "<br>") +
                        "</div></html>",
                SwingConstants.CENTER
        );

        // Estilo
        titulo.setFont(new Font("Arial", Font.BOLD, 16));
        cuerpoTexto.setFont(new Font("Arial", Font.PLAIN, 14));



        setVisible(true);
    }
}
