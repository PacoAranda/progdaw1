/**
 * 
 * 
 * 
 * @author PacoAranda
 */
import java.util.Scanner;
public class aleatorios3{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    int num=0;
    int numpalo=0;
    String palo="";
    String numero="";
    
    numpalo=(int)(Math.random()*4+1);
    switch (numpalo){
      case 1:
        palo="bastos";
        break;
      case 2:
        palo="espadas";
        break;
      case 3:
        palo="copas";
        break;
      case 4:
        palo="oros";
        break;
      default:
    }
    
    num=(int)(Math.random()*10+1);
    switch (num){
      case 1:
        numero="as";
        break;
      case 10:
        numero="sota";
        break;
      case 11:
        numero="caballo";
        break;
      case 12:
        numero="rey";
        break;
      default:
        numero=String.valueOf(num);
    }
    
    System.out.print("Tu carta es el "+numero+" de "+palo);
    
    
    
  }
  
}

