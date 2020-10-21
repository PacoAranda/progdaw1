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
    int canp=0;
    int cann=0;
    
    for(int i=1; i<=10; i++){
      System.out.println("Introduce un número");
      
      num=leer.nextInt();
      if(num<0){
        canp=canp+1;
      }else{
        cann=cann+1;
        
      }
    }
    System.out.println("Hay "+canp+" números positivos y "+cann+" números negativos");
    
    
  }
  
}

