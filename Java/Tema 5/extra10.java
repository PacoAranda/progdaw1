/**
 * 
 * 
 * 
 * @author PacoAranda
 */
import java.util.Scanner;
public class extra10{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    String palabra="";
    String lista="";
    int tope=1;
    
    for(int i=0; i<tope;i++){
      System.out.print("Introduce una palabra (acaba con salir): ");
      palabra=leer.nextLine();
      if(palabra.equals("salir")){
       System.out.print(lista);
      }else{
        lista=lista+palabra+" ";
        tope=tope+1;
        
      }
      
    }
    
    
    
    
  }
  
}

