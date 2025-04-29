package Hilos.clase;

import lombok.Getter;
import lombok.Setter;

import javax.swing.*;

public class ProcesoF implements Runnable {
    @Getter @Setter private String marca;
    @Getter @Setter private String modelo;
    @Getter @Setter private double precio;

    // Constructor vacío
    public ProcesoF() {
    }

    public ProcesoF(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    @Override
    public void run() {
        String mensaje = "Marca: " + marca + "\nModelo: " + modelo + "\nPrecio: $" + precio;
        JOptionPane.showMessageDialog(null, mensaje, "Datos del Auto", JOptionPane.INFORMATION_MESSAGE);
    }
}
