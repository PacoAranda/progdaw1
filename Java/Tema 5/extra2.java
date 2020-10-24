/**
 * 
 * 
 * 
 * @author PacoAranda
 */
import java.util.Scanner;
public class extra2{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    int numnum=0;
    int primnum=0;
    
    System.out.print("Introduce el número de números: ");
    numnum= leer.nextInt();
    System.out.print("Introduce el número inicial: ");
    primnum= leer.nextInt();
    
    for (int i=primnum; i<(primnum+numnum); i++){
      if(i!=(primnum+numnum)-1){
        System.out.print(i+"-");
      }else{
        System.out.print(i);
      }
      
    }
    
    
    
  }
  
}

