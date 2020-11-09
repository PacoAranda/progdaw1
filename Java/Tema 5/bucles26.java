/**
 * 
 * 
 * 
 * @author PacoAranda
 */
import java.util.Scanner;
public class bucles26{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    int num=0;
    int dig=0;
    int cont=0;
    int resto=0;
    int longi=0;
    int comp=0;
    System.out.print("Introduce un número: ");
    num=leer.nextInt();
    int aux=num;
    System.out.print("Introduce un dígito del número: ");
    dig=leer.nextInt();
    do{ //para contar numero cifras
      aux=aux/10;
      longi++;
    }while(aux>0);
   
    do{ //va degradando el numero buscando coincidendias
      
      resto=num%10;
      if(resto==dig){
        System.out.println("El número "+dig+" ocupa la posición "+(longi-cont));
        comp++; // variable auxiliar para mostrar mensaje en caso de numero erroneo
      }
      num=num/10;
      cont++;
      
    }while(num>0);
    
    if(comp<1){ //mensje de error
      System.out.print("El dígito introducido no se encuentra en el número");
    }
  }
  
}

