package Hilos.clase;

public class ProcesoA extends  Thread {
    public void contar(int n){
        for (int i=1; i <n ; i++){
            System.out.println("inteaccion numero:" + i);
        }
    }

}
