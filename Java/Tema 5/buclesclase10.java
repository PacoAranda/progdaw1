/**
 * 
 * 
 * 
 * @author PacoAranda
 */
import java.util.Scanner;
public class buclesclase10{
  public static void main (String[] args){
    Scanner leer = new Scanner(System.in);
    int numfilas=0;
    
    System.out.print("Introduce un numero: ");
    numfilas=leer.nextInt();
    
    for (int i=1; i<=(numfilas);i++){
      
      for(int j=1;j<=numfilas-i; j++){
        System.out.print(" ");
        
      }
      for(int k=1; k<=i; k++){
        System.out.print(k);
      }
      for(int l=1; l<i; l++){
        System.out.print(i-l);
      }
      System.out.println("");
    }
    
  }
}



