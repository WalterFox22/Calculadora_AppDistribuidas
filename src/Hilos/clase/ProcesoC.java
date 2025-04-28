package Hilos.clase;

public class ProcesoC extends  Thread {
    public  void  dividir(int n){
        for (int i = 10; i>-2; i --){
            System.out.println(n/i);
        }
    }
}
