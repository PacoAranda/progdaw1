/**
 * 
 * 
 * 
 * @author PacoAranda
 */
import java.util.Scanner;
public class bucles13{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    
    int num=0;
    
    for(int i=1; i<=10; i++){
      System.out.println("Introduce un número");
      
      num=leer.nextInt();
      if(num<0){
        System.out.println("El número es negativo.");
      }else{
        System.out.println("El número es positivo.");
        
      }
    }
    
    
  }
  
}

