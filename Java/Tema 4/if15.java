import java.util.Scanner;
public class if15{
  public static void main (String[] args){
    Scanner leer=new Scanner(System.in);
    String s;
    int op;
    System.out.println("Introduce de qué símbolo quieres que esté formada tu pirámide: ");
    s=leer.nextLine();
    System.out.println("Por favor, introduce la orientación del vértice de tu pirámide: ");
    System.out.println("1-ARRIBA\n2-ABAJO\n3-DERECHA\n4-IZQUIERDA");
    System.out.print("Opción introducida: ");
    op=leer.nextInt();
    System.out.println("");
    
    switch (op){
      case 1:
        System.out.println(" "+" "+" "+s+" "+" "+" ");
        System.out.println(" "+" "+s+s+s+" "+" ");
        System.out.println(" "+s+s+s+s+s+" ");
        System.out.println(s+s+s+s+s+s+s);
        break;
      case 2:
        System.out.println(s+s+s+s+s+s+s);
        System.out.println(" "+s+s+s+s+s+" ");
        System.out.println(" "+" "+s+s+s+" "+" ");
        System.out.println(" "+" "+" "+s+" "+" "+" ");
        break;
      case 3:
        System.out.println(s);
        System.out.println(s+" "+s);
        System.out.println(s+" "+s+" "+s);
        System.out.println(s+" "+s+" "+s+" "+s);
        System.out.println(s+" "+s+" "+s);
        System.out.println(s+" "+s);
        System.out.println(s);
        break;
      case 4:
        System.out.printf("%8s",s+"\n");
        System.out.printf("%8s",s+" "+s+"\n");
        System.out.printf("%8s",s+" "+s+" "+s+"\n");
        System.out.printf("%7s",s+" "+s+" "+s+" "+s+"\n");
        System.out.printf("%8s",s+" "+s+" "+s+"\n");
        System.out.printf("%8s",s+" "+s+"\n");
        System.out.printf("%8s",s+"\n");
        break;
      default:
        System.out.println("Opción seleccionada no válida");
      
    }
  }
}
