/**
 * 
 * 
 * 
 * @author PacoAranda
 */
import java.util.Scanner;
public class buclesclase7{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    int numfilas=0;
    String lista="";
    System.out.println("Introduce un numero:");
    numfilas=leer.nextInt();
    
    //Cadena de caracteres
    
    /*for(int i=1; i<=numfilas;i++){
      lista=lista+i+" ";
      System.out.println(lista);
      
      
    }
    */
    
    //Doble bucle
    
    for (int i=1; i<=numfilas;i++){
      for(int j=1;j<=i;j++){
        System.out.print(j+" ");
       
        
      }
      System.out.println("");
    }
    
    
  }
  
}

