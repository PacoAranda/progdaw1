/**
 * 
 * 
 * 
 * @author PacoAranda
 */
import java.util.Scanner;
public class aleatorios2{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    int num=0;
    int numpalo=0;
    String palo="";
    String numero="";
    
    numpalo=(int)(Math.random()*4+1);
    switch (numpalo){
      case 1:
        palo="tréboles";
        break;
      case 2:
        palo="corazones";
        break;
      case 3:
        palo="picas";
        break;
      case 4:
        palo="rombos";
        break;
      default:
    }
    
    num=(int)(Math.random()*13+1);
    switch (num){
      case 1:
        numero="As";
        break;
      case 11:
        numero="J";
        break;
      case 12:
        numero="Q";
        break;
      case 13:
        numero="K";
        break;
      default:
        numero=String.valueOf(num);
    }
    
    System.out.print("Tu carta es el "+numero+" de "+palo);
    
  }
  
}

