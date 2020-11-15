/**
 * 
 * 
 * 
 * @author PacoAranda
 */
import java.util.Scanner;
public class aleatorios18{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    int numcolor=0;
    int tirada1=0;
    int tirada2=0;
    int tirada3=0;
    String combinacion="";
    String color="";
    for(int i=1;i<=3;i++){
      switch(i){
        case 1:
          tirada1=(int)(Math.random()*6+1);
          numcolor=tirada1;
          break;
        case 2:
          do{
            tirada2=(int)(Math.random()*6+1);
          }while(tirada2==tirada1);
          numcolor=tirada2;
          break;
        case 3:
          do{
            tirada3=(int)(Math.random()*6+1);
          }while(tirada3==tirada2 && tirada3==tirada1);
          numcolor=tirada3;
          break;
        default:
          
      }
     
        
      switch(numcolor){
        case 1:
          color="rojo";
          combinacion=combinacion+color+" ";
          break;
        case 2:
          color="azul";
          combinacion=combinacion+color+" ";
          break;
        case 3:
          color="verde";
          combinacion=combinacion+color+" ";
          break;
        case 4:
          color="amarillo";
          combinacion=combinacion+color+" ";
          break;
        case 5:
          color="violeta";
          combinacion=combinacion+color+" ";
          break;
        case 6:
          color="violeta";
          combinacion=combinacion+color+" ";
          break;
        default:
         
        
      }
      
    }
    
    System.out.print("La combinacion de colores es: "+combinacion);
    
    
  }
  
}

