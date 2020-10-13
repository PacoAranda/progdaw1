import java.util.Scanner;
public class if4{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    int horat=0;
    int precihor=12;
    int precihorex=16;
    int salario=0;
    
    System.out.println("Introduce el numero de horas trabajadas esta semana: ");
    horat = leer.nextInt();
    if (horat<=40){
      salario=horat*precihor;
      System.out.println("Tu salario de la semana es "+salario+"€");
    }else{
      salario=(40*precihor)+((horat-40)*precihorex);
      System.out.print("Tu salario de la semana es "+salario+"€");
     } 
    
    
  }
}
