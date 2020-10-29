/**
 * 
 * 
 * 
 * @author PacoAranda
 */
import java.util.Scanner;
public class buclesclase11{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    int altura=0;
    System.out.print("Introduce un número para la altura: ");
    altura=leer.nextInt();
    
    for(int i=1; i<=altura;i++){
      for(int j=altura-1;j>=i;j--){
        System.out.print(" ");
        
      }
      for(int j=1;j<=i*2;j++){
        if(j%2!=0){
          System.out.print("*");
        }else{
          System.out.print(" ");
        }
        
      }
      System.out.println();
    }
    
    
    
  }
  
}

