/**
 * 
 * 
 * 
 * @author PacoAranda
 */
import java.util.Scanner;
public class arraysuni3{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    
    int num[]=new int[10];
    
    for(int i=0;i<10;i++){
      System.out.print("Introduce un número: ");
      num[i]=leer.nextInt();
    }
    
    for(int j=9;j>=0;j--){
      System.out.println(num[j]);
    }
    
  }
  
}

