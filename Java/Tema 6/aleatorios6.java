/**
 * 
 * 
 * 
 * @author PacoAranda
 */
import java.util.Scanner;
public class aleatorios6{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    int numero=(int)(Math.random()*101);
    System.out.print(numero);
    int intentos=1;
    boolean acierto=false;
    int numteclado=0;
    do{
      System.out.print("Adivina el número (entre 0 y 100): ");
      numteclado=leer.nextInt();
      if(numteclado>numero){
        System.out.println("El número introducido es mayor que el número pensado.");
        System.out.println("Le quedan "+(5-intentos)+" intentos");
      }
      if(numteclado<numero){
        System.out.println("El número introducido es menor que el número pensado.");
        System.out.println("Le quedan "+(5-intentos)+" intentos");
      }
      if(numteclado==numero){
        System.out.println("Enhorabuena, has acertado");
        acierto=true;
      }
      intentos++;
    }while(intentos<=5 && numteclado!=numero);
    
    if(!acierto){
      System.out.print("Número de intentos agotado");
    }
    
  }
  
}

