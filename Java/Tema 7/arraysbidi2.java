/**
 * 
 * 
 * 
 * @author PacoAranda
 */
import java.util.Scanner;
public class arraysbidi2{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    int num [][]=new int[4][5];
    int sumafila=0;
    int sumacolu=0;
    int cont=20;
    int total=0;
    for(int i=0; i<num.length;i++){
      for(int j=0; j<num[0].length;j++){
        cont--;
        System.out.print("Introduce un número para su matriz: ");
        num[i][j]=leer.nextInt();
        System.out.println("Quedan "+ (cont) +" números");
        total+=num[i][j];
      }
    }
    System.out.println();
    System.out.println("Su matriz es la siguiente: ");
    for(int i=0; i<num.length;i++){
      System.out.print("[");
      for(int j=0; j<num[0].length;j++){
        System.out.print(num[i][j]+" ");
      }
      System.out.println("]");
    }
    for(int i=0;i<num.length;i++){
      for(int j=0;j<num[0].length;j++){
        sumafila+=num[i][j];
      }
      System.out.println("La suma de la fila "+i+" es: "+sumafila);
      sumafila=0;
    }
    for(int j=0;j<num[0].length;j++){
      for(int i=0;i<num.length;i++){
        sumacolu+=num[i][j];
      }
      System.out.println("La suma de la columna "+j+" es: "+sumacolu);
      sumacolu=0;
    }
    System.out.print("El total de todos los valores es: "+total);
    
  }
  
}

