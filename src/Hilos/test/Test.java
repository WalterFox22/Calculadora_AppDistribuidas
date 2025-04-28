package Hilos.test;

import Hilos.clase.ProcesoA;
import Hilos.clase.ProcesoB;
import Hilos.clase.ProcesoC;

public class Test {
    public static void main(String[] args) {
        ProcesoA a = new ProcesoA();
        ProcesoB b = new ProcesoB();
        ProcesoC c = new ProcesoC();

        c.dividir(10);
    }

}
