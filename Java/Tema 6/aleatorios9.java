/**
 * 
 * 
 * 
 * @author PacoAranda
 */
import java.util.Scanner;
public class aleatorios9{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    int numgen=0;
    int cont=0;
    do{
      numgen=(int)(Math.random()*51)*2;
      cont++;
      System.out.println(numgen);
    }while(numgen!=24);
    
    System.out.print("Se han generado "+cont+" numeros");
    
    
    
    
  }
  
}

