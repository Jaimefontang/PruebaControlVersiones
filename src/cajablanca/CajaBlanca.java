
package cajablanca;

import java.util.Scanner;

/**
*
* @author damiansu
*/
public class CajaBlanca {

   /**
    * @param args the command line arguments
    */
   
   
   private static int funcion(int b){
       return (int) (Math.random()*200-1);
   }
   
   public static void eowie(){
       System.out.print("Adivina el número del 1 al ... ");
   }
   public static void main(String[] args) {
       
       eowie();
       
       Scanner toucka = new Scanner(System.in);
       int c = -900;
       
       c=funcion(c);
       
       System.out.println(c);
       
       
       
   }
   
}
