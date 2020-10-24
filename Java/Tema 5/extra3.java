/**
 * 
 * 
 * 
 * @author PacoAranda
 */
import java.util.Scanner;
public class extra3{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    int numnum=0;
    int primnum=0;
    int salto=0;
    
    System.out.print("Introduce el número de números: ");
    numnum=leer.nextInt();
    System.out.print("Introduce el número inicial: ");
    primnum=leer.nextInt();
    System.out.print("Introduce el salto entre números: ");
    salto=leer.nextInt();
    
    for(int i=1; i<=numnum; i++){
      if (i!=numnum){
        System.out.print(primnum+"-");
      }else{
        System.out.print(primnum);

      }
      primnum=primnum+salto;
    }
    
    
  }
  
}

