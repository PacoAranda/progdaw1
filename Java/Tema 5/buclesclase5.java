/**
 * media de 10 num positivos. el programa recuerda los numeros introducidos
 * con una concatenacion acumulada en un string separados por -
 * 
 * @author PacoAranda
 */
import java.util.Scanner;
public class buclesclase5{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    String nums="";
    int num=0;
    int tot=0;
    int div=0;
    double med=0;
     
      tot=tot+num;
    for(int i=1; i<=10;i++){
      if(i==1){
        System.out.println("Introduce un número");
      num=leer.nextInt();
      nums=""+num;
      }else{
        System.out.println("Introduce un número");
      num=leer.nextInt();
      nums=nums+"-"+num;
      tot=tot+num;
      }
      
      
    }
    med=(double)tot/10;
    System.out.println("La media de "+nums+" es "+med);
    
  }
  
}

