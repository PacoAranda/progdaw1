/**
 * 
 * 
 * 
 * @author PacoAranda
 */
import java.util.Scanner;
public class buclesclase8{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    int numfilas=0;
    
    String lista="";
    
    System.out.println("Introduce un numero:");
    numfilas=leer.nextInt();
    
    /*for (int i=1; i<numfilas*2;i++){
      lista=lista+i+" ";
      if (i%2!=0){
         System.out.println(lista);
        
      }
      
    }
    */
    
    for (int i=1; i<=(numfilas*2)-1;i=i+2){
      for(int j=1;j<=i;j++){
        System.out.print(j+" ");
        
      }
      System.out.println("");
    }
      
      
      
    
  }
  
}

