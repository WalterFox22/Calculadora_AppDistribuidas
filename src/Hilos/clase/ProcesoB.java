package Hilos.clase;

public class ProcesoB  extends  Thread{


    // Constructor
    private  int n;

    public ProcesoB(int n){
        this.n=n;
    }



    /*public void contar (int n){
      for (int i=1; i <n ; i++){
         System.out.println("inteaccion numero:" + i);
       }
    }*/

    @Override
    public  void run(){

        // Bucle para que se ejecute sin importar si el otros procesos se terminan
        for (int i=1; i <n ; i++){
            System.out.println("inteaccion numero:" + i);
            // logica para realizar eso
            try{
                sleep(2000);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }

    }
}
