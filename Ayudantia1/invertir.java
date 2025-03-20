import java.util.Scanner;

public class invertir{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Ingrese cadena de texto: ");
        String text = scan.nextLine();
        String textInverted = "";
        int x = text.length()-1;
        while(x >= 0){
            textInverted += text.charAt(x);
            x--;
        }
        System.out.println(textInverted);
        scan.close();
    }
}
