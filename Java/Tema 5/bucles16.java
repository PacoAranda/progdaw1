/**
 * 
 * 
 * 
 * @author PacoAranda
 */
import java.util.Scanner;
public class bucles16{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    
    int num=0;
    int cont=0;
    boolean primo=false;
    System.out.println("Introduce un número");
    num=leer.nextInt();
    
    
    for (int i=2; i<num; i++){
      if(num%i==0){
        primo=true;
        
      }
      
    }
    if(primo){
      System.out.println("El número no es primo");
      
    }else{
      System.out.println("El numero es primo");
    }
    
  }
  
}

