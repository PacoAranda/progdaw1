/**
 * 
 * 
 * 
 * @author PacoAranda
 */
import java.util.Scanner;
public class arraysuni10{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    int[] n=new int[20];
    int[] par=new int[20];
    int[] impar=new int[20];
    int pares=0;
    int impares=0;
    for(int i=0; i<20; i++){
      n[i]=(int)(Math.random()*101);
      if (n[i]%2==0) {
        par[pares++]=n[i];
      }else{
        impar[impares++]=n[i];
       }
      }
    System.out.println("Lista original:");
    for (int j=0; j<20; j++){
      System.out.print(n[j]+" ");
    }
    System.out.println();

    for (int k=0; k<pares; k++){
      n[k] = par[k];
    }
    for (int l=pares; l<20; l++){
      n[l] = impar[l - pares];
    }
    System.out.println("Lista con los pares al principio:");
    for (int m=0; m<20; m++){
      System.out.print(n[m]+" ");
    }
  }
  
}

