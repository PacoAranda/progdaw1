/**
 * 
 * 
 * 
 * @author PacoAranda
 */
import java.util.Scanner;
public class extra8{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    int tope=1;
    int num=0;
    for (int i=0; i<=tope;i++){
      System.out.print("Introduzca un número entero (0 para salir): ");
      num=leer.nextInt();
      if(num!=0){
        System.out.println("El cuadrado de "+num+" es "+num*num);
        tope=tope+1;
      }else{
        break;
      }
    }
    
    
    
  }
  
}

