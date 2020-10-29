/**
 * 
 * 
 * 
 * @author PacoAranda
 */
import java.util.Scanner;
public class bucles29{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    int tope=0;
    int div=0;
    System.out.print("Introduce el número tope: ");
    tope=leer.nextInt();
    System.out.print("Introduce el número por el que se divide: ");
    div=leer.nextInt();
    
    for(int i=1;i<=tope-1;i++){
      if(i%div!=0){
        System.out.print(i+" ");
      }
      
    }
    
    
    
  }
  
}

