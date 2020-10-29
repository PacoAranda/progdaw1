/**
 * 
 * 
 * 
 * @author PacoAranda
 */
import java.util.Scanner;
public class bucles21{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    int num=0;
    int mayorpar=0;
    int suma=0;
    int contpar=0;
    int contimp=0;
    int cont=0;
    do{
      System.out.print("Introduce un número (negativo para salir): ");
      num=leer.nextInt();
      if(num%2==0){
        if(num>=mayorpar){
          mayorpar=num;
          contpar++;
        }
      }else{
        suma=suma+num;
        contimp++;
      }
      cont++;
    }while(num>=0);
    suma=suma-num;
    cont=cont-1;
    if (num%2!=0){
      contimp=contimp-1;
    }
    if(contpar==0){
      System.out.println("Se han introducido: "+cont+" números");
      System.out.print("La media es: "+(suma/contimp));
    }else{
      if(contimp==0){
        System.out.println("Se han introducido: "+cont+" números");
        System.out.print("El mayor par es: "+mayorpar);
      }else{
        System.out.println("Se han introducido: "+cont+" números");
        System.out.println("La media es: "+(suma/contimp));
        System.out.print("El mayor par es: "+mayorpar);
      }
    }
    
    
  }
  
}

