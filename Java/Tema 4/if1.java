import java.util.Scanner;
public class if1{
  public static void main (String[] args){
    Scanner leer = new Scanner(System.in);
    String dia;
    System.out.println("Introduce un día de la semana: ");
    dia = leer.nextLine();
    
    switch (dia){
      case "lunes":
        System.out.println("Programacion");
        break;
      case "martes":
        System.out.println("Sistemas informaticos");
        break;
      case "miercoles":
        System.out.println("Programacion");
        break;
      case "jueves":
        System.out.println("Programacion");
        break;   
      case "viernes":
        System.out.println("Sistemas informaticos");
        break;   
      default:
        System.out.println("Dato introducido no valido");
        
    }
  }
}
