/**
 * 
 * 
 * 
 * @author PacoAranda
 */
import java.util.Scanner;
public class aleatorios1{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    int tirada=0;
    int suma=0;
    
    for(int i=1;i<4;i++){
      tirada=(int)(Math.random()*6+1);
      suma=suma+tirada;
      System.out.println("Tirada "+i+": "+tirada);
    }
    System.out.print("La suma de las tres tiradas es: "+suma);
    
    
    
  }
  
}

