//programa q realice por pantalla 10 sumas de 2 numeros los cuales se pediran al usuario
import java.util.Scanner;
public class buclesclase2{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    
    int num1=0;
    int num2=0;
    int res=0;
    for(int i=0; i<10; i++){
      System.out.println("Introduce dos números para ser sumados");
      num1=leer.nextInt();
      num2=leer.nextInt();
      
      res=num1+num2;
      
      System.out.println("El resultado es: "+res);
      
    }
    
  }
}
