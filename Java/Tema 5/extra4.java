/**
 * 
 * 
 * 
 * @author PacoAranda
 */
import java.util.Scanner;
public class extra4{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    int numalt=0;
    int numbaj=0;
    int salto=0;
    
    System.out.print("Introduce el número más alto: ");
    numalt=leer.nextInt();
    System.out.print("Introduce el número más bajo: ");
    numbaj=leer.nextInt();
    System.out.print("Introduce el salto entre números: ");
    salto=leer.nextInt();
    
    for(int i=numalt; i>=numbaj;i=i-salto){
      if((i-numbaj)>=salto){
        System.out.print(i+"-");
      }else{
        System.out.print(i);
      }
      
    }
    
  }
  
}

