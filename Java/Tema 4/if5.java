import java.util.Scanner;
public class if5{
  public static void main (String[] args){
    Scanner leer = new Scanner(System.in);
    int a=0;
    int b=0;
    double res=0;
    
    System.out.println("Este programa resuelve la ecuacion de primer grado del tipo: ax+b=0");
    System.out.println("Introduce el  valor de a:");
    a = leer.nextInt();
    if (a==0){
      System.out.println("Esa ecuacion no tiene solucion real");
    }else{
      System.out.println("Introduce el  valor de b:");
      b=leer.nextInt();
      res=((double)-b/(double)a);
      System.out.print("El resultado de la ecuacion es "+res);
     }
    
    
  }
}
