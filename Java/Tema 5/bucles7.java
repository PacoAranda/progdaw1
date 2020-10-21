/**
 * 
 * 
 * 
 * @author PacoAranda
 */
import java.util.Scanner;
public class bucles7{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    
    String clave;
    
    for(int i=1; i<=4; i++){
      System.out.println("Introduce la clave:");
      
      clave=leer.nextLine();
      
      if (clave.equals("2468")){
         System.out.println("Clave correcta");
        break;
        
      }else{
        if(i!=4){
          System.out.println("Lo sentimos, inténtelo de nuevo");
        }else{
          System.out.println("Numero de intentos fallidos superado.");
        }
        
      }
       
    } 
    
    
    
  }
  
}

