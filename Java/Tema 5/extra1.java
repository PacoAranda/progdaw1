/**
 * 
 * 
 * 
 * @author PacoAranda
 */
import java.util.Scanner;
public class extra1{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    int num=0;
    System.out.print("Introduce un número: ");
    num= leer.nextInt();
    for(int i=1; i<=num; i++){
      if(i!=num){
       System.out.print(i+"-");  
      }else{
        System.out.print(i);

      }
              
    }
    
    
    
  }
  
}

