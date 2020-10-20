//tabla de potencias de un numero pedido x teclado. capturar numero filas. el primero elevado 1 y luego a 2...
import java.util.Scanner;
public class buclesclase4{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    
    int num=0;
    int numf=0;
    int numt=1;
    
    System.out.println("Introduce el número del que quieres hacer la potencia:");
    num=leer.nextInt();
    System.out.println("Introduce el número de filas que quieres que tenga la potencia:");
    numf=leer.nextInt();
    
    for (int i=1; i<=numf; i++){
      numt=numt*num;
      System.out.println(numt);
    }
  }  
  
}
