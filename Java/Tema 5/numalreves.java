/**
 * 
 * 
 * 
 * @author PacoAranda
 */
import java.util.Scanner;
public class numalreves{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    int num=0;
    int res=0;
    System.out.print("Introduce un número para ponerlo al revés: ");
    num=leer.nextInt();
    
    do{
      res=res*10+(num%10);
      num=num/10;
      
    }while(num!=0);
    
    System.out.print(res);
    
  }
  
}

