/**
 * 
 * 
 * 
 * @author PacoAranda
 */
import java.util.Scanner;
public class extra6{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    int altura=0;
    System.out.print("Introduce la altura: ");
    altura= leer.nextInt();
    
    for(int i=1; i<=altura;i++){
      
      for(int k=1;k<=i;k++){
        System.out.print(i);
        
      }
      System.out.println("");
    }
    System.out.println("");
    System.out.println("");
    for(int i=0; i<altura;i++){
      
      for(int k=0;k<=i;k++){
        if (i!=0){
          System.out.print(altura-i);
        }else{
          System.out.print(altura);
        }
        
        
      }
      System.out.println("");
    }
    System.out.println("");
    System.out.println("");
     for(int i=1; i<=altura;i++){
      for(int k=1; k<=i;k++){
        System.out.print(k);
        
      }
      System.out.println("");
    }
    
    
  }
  
}

