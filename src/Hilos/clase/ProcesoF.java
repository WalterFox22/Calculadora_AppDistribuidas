package Hilos.clase;

import Hilos.vista.VistaResultado;
import lombok.Getter;
import lombok.Setter;

public class ProcesoF implements Runnable {
    @Getter @Setter private String marca;
    @Getter @Setter private String modelo;
    @Getter @Setter private double precio;

    public ProcesoF(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    @Override
    public void run() {
        try {
            // Simula tiempo de procesamiento
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Formatea mensaje de salida
        String resultado = String.format(
                "Información del Producto:\nMarca: %s\nModelo: %s\nPrecio: $%.2f",
                marca, modelo, precio
        );

        // Lanza pantalla de resultado
        new VistaResultado(resultado);
    }
}
