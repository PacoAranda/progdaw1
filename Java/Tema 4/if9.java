import java.util.Scanner;
public class if9{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    int a=0;
    int b=0;
    int c=0;
    double sol1=0;
    double sol2=0;
    
    System.out.println("Este programa realiza una ecuacion de segundo grado del tipo: ax²+bx+c=0");
    System.out.println("Introduce el valor de a:");
    a=leer.nextInt();
    if (a==0){
      System.out.print("Esta ecuacion no tiene solucion real");
    }else{
      System.out.println("Introduce el valor de b:");
      b=leer.nextInt();
     }if (b==0){
      System.out.println("Introduce el valor de c:");
      c=leer.nextInt();
      if (c!=0){
        System.out.println("Esta ecuación no tiene una solución real");
      }else{
        sol1 = (-b + Math.sqrt(b^2-4*a*c)) / 2*a;
        sol2 = (-b - Math.sqrt(b^2-4*a*c)) / 2*a;
        System.out.println("La primera solución de la ecuación es: "+sol1);
        System.out.println("La segunda solución de la ecuación es: "+sol2);

      }
     }else{
       System.out.println("Introduce el valor de c:");
       c=leer.nextInt();
       sol1 = (-b + Math.sqrt(b^2-4*a*c)) / 2*a;
       sol2 = (-b - Math.sqrt(b^2-4*a*c)) / 2*a;
       System.out.println("La primera solución de la ecuación es: "+sol1);
       System.out.println("La segunda solución de la ecuación es: "+sol2);
     }
    
    
  }
}
