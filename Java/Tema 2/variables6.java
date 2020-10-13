import java.util.Scanner;
public class variables6{
 public static void main (String[] args){
   Scanner leer = new Scanner(System.in);
   System.out.println("Introduce tu base imponible (en euros)");
   double base = leer.nextDouble();
   
   double iva=base*0.21;
   
   double total = base+iva;
   
   System.out.printf("El total de su factura es %.2f€",total);
   
 }
 
}
