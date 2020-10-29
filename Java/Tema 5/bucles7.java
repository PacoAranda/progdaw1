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
    int clave=0;
    int cont=1;
    
    do{
      System.out.print("Introduce la clave: ");
      clave=leer.nextInt();
      cont++;
     
    }while((clave!=1234) && (cont<=4));
    
    if(clave==1234){
      System.out.println("Enhorabuena, has abierto la caja.");
    }else{
      System.out.println("Lo sentimos, número de intentos excedido.");
    }
      
      

    
    
    
  }
  
}

