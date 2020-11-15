/**
 * 
 * 
 * 
 * @author PacoAranda
 */
import java.util.Scanner;
public class arraysuni4{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    int num[]=new int[20];
    int cuadrado[]=new int[20];
    int cubo[]=new int[20];
    
    for(int i=0;i<20;i++){
      num[i]=(int)(Math.random()*101);
      cuadrado[i]=num[i]*num[i];
      cubo[i]=cuadrado[i]*num[i];
      
      System.out.printf("%-6d %-6d %-6d\n",num[i],cuadrado[i],cubo[i]);
    }
  
 }
}

