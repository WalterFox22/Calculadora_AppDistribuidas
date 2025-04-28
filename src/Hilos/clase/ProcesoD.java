package Hilos.clase;

public class ProcesoD implements Runnable{

     private  int n;
     public ProcesoD(int numero){
         n=numero;
     }


    // main por valor quemado
    public  void  repetir (int n){
        for (int i = 0; i<n; i ++){
            System.out.println("*****************");
        }
    }

    @Override
    public  void run (){
        repetir(n);
    }
}
