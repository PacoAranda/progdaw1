/**
 * 
 * 
 * 
 * @author PacoAranda
 */
import java.util.Scanner;
public class RotacionesExamen{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    int num=0;
    int rot=0;
    int cont=0;
    System.out.print("Introduce un número: ");
    num=leer.nextInt();
    int aux=num;
    System.out.print("Introduce cuántas posiciones quieres rotar a la derecha: ");
    rot=leer.nextInt();
    
    //cuenta numero digitios
    do{         
      aux=aux/10;
      cont++;
    }while(aux>0);
    
    for(int i=0; i<rot;i++){ //cuenta nº desplazamientos de una unidad
      aux=num%10;
      num=num/10;
      for(int j=0;j<cont-1;j++){
        aux=aux*10;
      }
      num=aux+num;
    }
    System.out.println("Resulta: "+num);
    
    
  }
  
}

