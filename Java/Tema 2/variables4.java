import java.util.Scanner;

public class variables4 {
  public static void main (String[] args){
    
    Scanner leer = new Scanner(System.in);
    
    double pes = 166.386;
    System.out.println("Hola, introduce cuantos euros quieres convertir a pesetas");
    double eur=leer.nextDouble();
    double conv = eur*pes;
    System.out.printf("%.2f euros son %.4f pesetas",eur,conv);
    
    
  }
  
}
