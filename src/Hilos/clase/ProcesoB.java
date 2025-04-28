package Hilos.clase;

public class ProcesoB  extends  Thread{
    public void saludar (String nombre){
        System.out.println("Hola " + nombre);
    }
}
