/**
 * 
 * 
 * 
 * @author PacoAranda
 */
import java.util.Scanner;
public class bucles60{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    int altura=0;
    do{
      System.out.print("Introduce la altura de los calcetines: ");
      altura=leer.nextInt();
    }while(altura<4);
    System.out.println();
    for(int i=0; i<altura-2;i++){
      System.out.print("***     ***");
      System.out.println();
    }
    for(int i=0; i<2; i++){
      System.out.print("******  ******");
      System.out.println();
    }
    
    
    
    
  }
  
}

