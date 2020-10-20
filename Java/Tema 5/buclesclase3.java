//programa q escriba por pantalla la tabla de multiplicar de un numero introducido por telcado. tambien se ha de pedir la cantidad de filas que ha de tener la tabla
import java.util.Scanner;
public class buclesclase3{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    
    int num=0;
    int numf=0;
    int numt=0;
    
    System.out.println("Introduce el número del que quieres hacer la tabla:");
    num=leer.nextInt();
    System.out.println("Introduce el número de filas que quieres que tenga la tabla:");
    numf=leer.nextInt();
    
    for (int i=1; i<=numf; i++){
      numt = num*i;
      
      System.out.println(num+"*"+i+"="+numt);
      
    }
  }  
  
}
