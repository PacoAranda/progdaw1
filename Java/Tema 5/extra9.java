/**
 * 
 * 
 * 
 * @author PacoAranda
 */
import java.util.Scanner;
public class extra9{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    int num=-1;
  
    
    for (int i=1; (i<=4) && (num!=0);i++){
      System.out.print("Introduzca un número entero (0 para salir): ");
      num=leer.nextInt();
      if(num!=0){
        System.out.println("El cuadrado de "+num+" es "+num*num);
      }
      
    }
    
  }
  
}

