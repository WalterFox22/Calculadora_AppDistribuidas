package Hilos.test;

import Hilos.clase.*;

public class Test {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.setNombre("Walter Cobacango");
        p.setFechaNacimiento("01 de Enero del 2005");
        p.setDireccion("Quito - Ecuador");

        System.out.println("Nombre: "+ p.getNombre());
        System.out.println("Fecha de nacimiento: "+ p.getFechaNacimiento());
        System.out.println("Dirección: "+ p.getDireccion());


        /*
        ProcesoA a = new ProcesoA("Walter");
        ProcesoB b = new ProcesoB(100);
        ProcesoC c = new ProcesoC(5);
        //ProcesoD d = new ProcesoD();

        // Se crea un tipo de constructor
        Runnable x= new ProcesoD(50);
        // Le vinvula a un objeto y se crea un hilo
        Thread d = new Thread(x);

        Runnable z = new ProcesosE();
        Thread e = new Thread();

     ;   a.start();
        b.start();
        c.start();
        d.start();
        e.start();
         */



    }


}
