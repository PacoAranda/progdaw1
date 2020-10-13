import java.util.Scanner;
public class variables5{
 public static void main (String[] args){
   
    Scanner leer = new Scanner(System.in);
    double eur = 0.006;
    System.out.println("Introduce cuantas pesetas quieres convertir a euros");
    double pes = leer.nextDouble();
    double conv = pes*eur;
    System.out.println(pes + " pesetas, son " + conv + " euros");
    
   
 } 
  
}
