package Hilos.test;

import Hilos.clase.ProcesoA;
import Hilos.clase.ProcesoB;
import Hilos.clase.ProcesoC;

public class Test {
    public static void main(String[] args) {
        ProcesoA a = new ProcesoA("Walter");
        ProcesoB b = new ProcesoB(6);
        ProcesoC c = new ProcesoC(6);

        c.start();
        a.start();
        b.start();
    }

}
