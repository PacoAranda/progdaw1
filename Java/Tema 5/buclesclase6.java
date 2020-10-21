/**
 * pide un numero entero, si es par presenta la tabla de multiplicar
 * si es impar la tabla de sumar
 * 
 * @author PacoAranda
 */
import java.util.Scanner;
public class buclesclase6{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    int num=0;
    int resm=0;
    int ress=0;
    
    System.out.println("Introduce un número:");
    num=leer.nextInt();
    
    if(num%2==0){
      for(int i=1; i<=10; i++){
        resm=num*i;
        System.out.println(num+"*"+i+"="+resm);
      }
    }else{
      for(int i=1; i<=10; i++){
        ress=num+i;
        System.out.println(num+"+"+i+"="+ress);
      
      }
     }
    
    
    
  }
}

