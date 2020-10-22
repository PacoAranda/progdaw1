/**
 * 
 * 
 * 
 * @author PacoAranda
 */
import java.util.Scanner;
public class buclesclase9{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    int numfilas=0;
    
    System.out.print("Introduce un numero: ");
    numfilas=leer.nextInt();
    
    for (int i=1; i<=(numfilas*2)-1;i=i+2){
      
      for(int j=1;j<=((numfilas*2)-1)-i; j=j+2){
        System.out.print(" ");
        
      }
      for(int k=1; k<=i; k++){
        if(k>=10){
          int l=(k%10);
          System.out.print(l);
        }else{
          System.out.print(k);
          
        }
        
      }
      
      System.out.println("");
    }
  }
}
