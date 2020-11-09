/**
 * 
 * 
 * 
 * @author PacoAranda
 */
import java.util.Scanner;
public class bucles32{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    long num=0;
    int suma=0;
    long aux=0;
    int resto=0;
    String pares="";
    System.out.print("Introduce un número: ");
    num=leer.nextLong();
    
    for(int i=0; i<10;i++){
      aux=num;
      while(aux>0){
        if(aux%10==i){
          if (i%2==0){
            pares=pares+i+" ";
            suma=suma+i;
          }
        }
        
        aux=aux/10;
      }
      
    }
    
    System.out.println("Dígitos pares: "+pares);
    System.out.println("Su suma es: "+suma);
  }
  
}

