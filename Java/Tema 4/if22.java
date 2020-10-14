import java.util.Scanner;
public class if22{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    int finde=6660;
    int mindia=1440;
    int hora=0;
    int minuto=0;
    int trest=0;
    int dia=0;
    System.out.println("Introduce qué día de la semana es: 1-LUNES, 2-MARTES ... hasta viernes");
    dia = leer.nextInt();
    
    switch (dia){
      case 1:
        System.out.println("Introduce qué hora es (número de hora): ");
        hora=leer.nextInt();
        System.out.println("Introduce cuántos minutos han pasado dentro de la hora introducida: ");
        minuto=leer.nextInt();
        minuto=minuto+(hora*60);
        trest=finde-minuto;
        System.out.println("Quedan "+trest+" minutos para el fin de semana");
        break;
      case 2:
        System.out.println("Introduce qué hora es (número de hora): ");
        hora=leer.nextInt();
        System.out.println("Introduce cuántos minutos han pasado dentro de la hora introducida: ");
        minuto=leer.nextInt();
        minuto=minuto+(hora*60);
        trest=finde-minuto-mindia;
        System.out.println("Quedan "+trest+" minutos para el fin de semana");
        break;
      case 3:
        System.out.println("Introduce qué hora es (número de hora): ");
        hora=leer.nextInt();
        System.out.println("Introduce cuántos minutos han pasado dentro de la hora introducida: ");
        minuto=leer.nextInt();
        minuto=minuto+(hora*60);
        trest=finde-minuto-(mindia*2);
        System.out.println("Quedan "+trest+" minutos para el fin de semana");
        break;
      case 4:
        System.out.println("Introduce qué hora es (número de hora): ");
        hora=leer.nextInt();
        System.out.println("Introduce cuántos minutos han pasado dentro de la hora introducida: ");
        minuto=leer.nextInt();
        minuto=minuto+(hora*60);
        trest=finde-minuto-(mindia*3);
        System.out.println("Quedan "+trest+" minutos para el fin de semana");
        break;
      case 5:
        System.out.println("Introduce qué hora es (número de hora): ");
        hora=leer.nextInt();
        System.out.println("Introduce cuántos minutos han pasado dentro de la hora introducida: ");
        minuto=leer.nextInt();
        minuto=minuto+(hora*60);
        trest=finde-minuto-(mindia*4);
        if (trest>=finde){
          System.out.println("Ya es fin de semana!");
        }else{
          System.out.println("Quedan "+trest+" minuto(s) para el fin de semana");
        }
        
        break;
        default:
          System.out.println("Día introducido no válido");
      
      
      
    }
      
  
  }
}
