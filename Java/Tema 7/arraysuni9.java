/**
 * 
 * 
 * 
 * @author PacoAranda
 */
import java.util.Scanner;
public class arraysuni9{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    int num[]=new int[8];
    
    for(int i=0;i<8;i++){
      System.out.print("Introduce un número: ");
      num[i]=leer.nextInt();
    }
    
    for(int j=0;j<8;j++){
      if(num [j]%2==0){
        System.out.println("Par: "+num[j]);
      }else{
        System.out.println("Impar: "+num[j]);
      }
    }
    
    
  }
  
}

