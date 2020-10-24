/**
 * 
 * 
 * 
 * @author PacoAranda
 */
import java.util.Scanner;
public class extra5{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    int num=0;
    System.out.print("Introduce un número: ");
    num=leer.nextInt();
    
    for(int i=1; i<=num;i++){
      for(int j=1; j<i;j++){
        System.out.print(" ");
      }
      System.out.println(i);
    }
    System.out.println("");
    System.out.println("");
    for(int i=1; i<=num;i++){
      for(int j=1; j<i;j++){
        System.out.print(" ");
      }
      for(int k=1; k<=i;k++){
        System.out.print(k);
        
      }
      System.out.println("");
    }
    System.out.println("");
    System.out.println("");
    for(int i=0; i<num;i++){
      for(int j=0; j<=i;j++){
        System.out.print(" ");
      }
      for(int k=num; k>=num-i;k--){
        System.out.print(k);
        
      }
      System.out.println("");
    }
  }
  
}

