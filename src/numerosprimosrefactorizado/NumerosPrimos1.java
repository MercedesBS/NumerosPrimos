package numerosprimosrefactorizado;

/**
 * @author Mercedes María Beltrán Suárez
 */

public class NumerosPrimos1 {   
    
    public static void main(String[] args) {
       int[] centArray = CribaEratostenes1.generarPrimos(100);
       for (int i=0;i<centArray.length;i++){
            System.out.println(centArray[i]);
            
        }
    
    }
}
    
    
 

