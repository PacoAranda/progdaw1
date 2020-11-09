/**
 * 
 * 
 * 
 * @author PacoAranda
 */
import java.util.Scanner;
public class bucles48{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    long num=0;
    String aparecen="";
    String noaparecen="";
    System.out.print("Introduce un número: ");
    num=leer.nextLong();
    for(int i=0; i<10;i++){
      boolean aparece=false;
      long aux=num;
      while(aux>0){
        if(aux%10==i){
          aparece=true;
        }
        aux=aux/10;
      }
      if(aparece){
        aparecen=aparecen+i+" ";
      }else{
        noaparecen=noaparecen+i+" ";
      }
    }
    System.out.println("Estos son los números que aparecen: "+aparecen);
    System.out.println("Estos son los números que no aparecen: "+noaparecen);
    
  }
  
}

