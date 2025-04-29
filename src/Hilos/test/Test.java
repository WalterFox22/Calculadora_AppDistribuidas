package Hilos.test;

import Hilos.clase.*;
import Hilos.vista.Vista;

public class Test {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.setNombre("Walter Cobacango");
        p.setFechaNacimiento("01 de Enero del 2005");
        p.setDireccion("Quito - Ecuador");

        System.out.println("Nombre: "+ p.getNombre());
        System.out.println("Fecha de nacimiento: "+ p.getFechaNacimiento());
        System.out.println("Dirección: "+ p.getDireccion());


        ProcesoB b = new ProcesoB(100);
        b.start();

        // Iniciar ProcesoF correctamente
        Runnable w = new ProcesoF();
        Thread q = new Thread(w);
        q.start();

        // 👉 Mostrar la pantalla de Auto (Vista)
        new Vista();


        /*
        ProcesoA a = new ProcesoA("Walter");
        ProcesoC c = new ProcesoC(5);
        //ProcesoD d = new ProcesoD();

        // Se crea un tipo de constructor
        Runnable x= new ProcesoD(50);
        // Le vinvula a un objeto y se crea un hilo
        Thread d = new Thread(x);

        Runnable z = new ProcesosE();
        Thread e = new Thread();

     ;   a.start();
        c.start();
        d.start();
        e.start();
         */



    }


}
