/**
 * 
 * 
 * 
 * @author PacoAranda
 */
import java.util.Scanner;
public class bucles57{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    int altura=0;
    System.out.print("Introduce la altura de la pirámide: ");
    altura=leer.nextInt();
    for(int i=1; i<=altura;i++){
      System.out.print("*");
    }
    System.out.println();
    for(int i=1; i<altura-1;i++){
      for(int j=1; j<=i;j++){
        System.out.print(" ");
      }
      System.out.print("*");
      for(int j=0;j<altura-i-2;j++){
        System.out.print(" ");
      }
      System.out.print("*");
      System.out.println();
    }
    
    for(int i=1; i<altura;i++){
      System.out.print(" ");
    }
    System.out.print("*");
  }
  
}

