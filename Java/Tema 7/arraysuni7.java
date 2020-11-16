/**
 * 
 * 
 * 
 * @author PacoAranda
 */
import java.util.Scanner;
public class arraysuni7{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    int num[]=new int[100];
    int num1=0;
    int num2=0;
    
    for(int i=0;i<100;i++){
      num[i]=(int)(Math.random()*21);
    }
    System.out.print("Elija un numero a ser cambiado: ");
    num1=leer.nextInt();
    System.out.print("Elija por qué numero quiere cambiarlo: ");
    num2=leer.nextInt();
    
    for(int j=0;j<100;j++){
      if(num[j]==num1){
        num[j]=num2;
        System.out.print("\""+num[j]+"\""+" ");
      }else{
        System.out.print(num[j]+" ");      
      }
    }
    
    
  }
  
}

