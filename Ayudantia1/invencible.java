import java.util.Scanner;

public class invencible{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int x, y;
        System.out.printf("Ingrese x: ");
        x = scan.nextInt();
        System.out.printf("Ingrese y: ");
        y = scan.nextInt();
        while(x <= y){
            if(x % 3 == 0 && x % 5 == 0){
                System.out.println("Invencible vs Omni-Man");
            }else if(x % 3 == 0){
                System.out.println("Invencible");
            }else if(x % 5 == 0){
                System.out.println("Omni-Man");
            }else{
                System.out.println(x);
            }
            x++;
        }
        scan.close();
    }
}
