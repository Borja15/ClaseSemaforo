
package ejerciciosemaforo;


public class Semaforo {
    int color = 0;
    boolean parpadeando = false;
    
    int getSemaforo(){
       return color;    
    }
     
    void subir(){
        if(color>=-2){
            color++;
        }
    }
    
    void bajar(){
        if(color>-2){
            color--;
        }
    }
    
    boolean parpadeando(){
        if(color==-1){
            return true;
        }else{
            return false;
        }
    }
   
}
