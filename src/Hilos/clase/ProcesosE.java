package Hilos.clase;


import javax.swing.*;

public class ProcesosE  implements  Runnable{
    public void  Pantalla (){
        JOptionPane.showConfirmDialog(null, "Hola como estas ");
    }

    @Override
    public  void run(){
        Pantalla();
    }


}
