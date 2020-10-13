import java.util.Scanner;
public class if2{
  public static void main (String[] args){
    Scanner leer = new Scanner(System.in);
    int hora=0;
    System.out.println("Introduce una hora del dia: ");
    hora = leer.nextInt();
    if (hora<1 || hora>24){
      System.out.print("Hora introducida no válida");
    } else{
        if (hora>=1 && hora<=5){
          System.out.println("Buenas noches");
        }else{
          if (hora>=6 && hora<=12){
            System.out.println("Buenos días");
          }else{
            if (hora>=13 && hora<=20){
              System.out.print("Buenas tardes");
            }else{
              System.out.print("Buenas noches");
             } 
           }  
         } 
      }
      
 }
}
