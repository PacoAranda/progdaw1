/**
 * 
 * 
 * 
 * @author PacoAranda
 */
import java.util.Scanner;
public class aleatorios5{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    int num=0;
    int max=100;
    int min=199;
    int suma=0;
    int media=0;
    
    for(int i=1;i<=50;i++){
      num=(int)(Math.random()*100)+100;
      if(num>=max){
        max=num;
      }else{
        if(num<=min){
          min=num;
        }
       }
      System.out.print(num+" ");
      suma=suma+num;
      media=suma/i;
    }
    System.out.println();
    System.out.println("El mínimo es "+min);
    System.out.println("El máximo es "+max);
    System.out.print("La media de los números es "+media);
    
    
    
  }
  
}

