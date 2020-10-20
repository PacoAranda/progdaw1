/**
 * 
 * 
 * 
 * @author PacoAranda
 */
import java.util.Scanner;
public class bucles11{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    int num=0;
    
    
    System.out.println("Introduce un número: ");
    num=leer.nextInt();
    int numtope=num+5;
    for(int i=num; i<=numtope; i++){
      System.out.printf("%-10s %-10s %-10s\n",i,i*i,i*i*i);
      
    }
    
    
    
  }
  
}

