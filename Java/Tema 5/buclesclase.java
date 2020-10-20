import java.util.Scanner;
public class buclesclase{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    //programa q pida al usuario una frase y el numero de veces que la va a repetir
    String frase;
    int cont=0;
    
    System.out.println("Introduce la frase que se va a repetir:");
    frase = leer.nextLine();
    System.out.println("Introduce cuantas veces quieres que se repita:");
    cont=leer.nextInt();
    
    for(int i=0; i<cont; i++){
      System.out.println(frase);      
      
    }
    
    
  }
  
}
