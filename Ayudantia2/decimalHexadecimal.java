import java.util.Scanner;

public class decimalHexadecimal{
    public static String convercion(int N){
        String hexadecimal = "";
        while(N > 0){
            int res = N%16;
            if(res < 10){
                hexadecimal = Integer.toString(res) + hexadecimal;
            }else{
                hexadecimal = ((char)('A' + (res-10))) + hexadecimal;
            }
            N /= 16;
        }
        return hexadecimal;
    }
    public static void main(String arg[]){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Ingresa numero N: ");
        int N = scan.nextInt();
        System.out.println(convercion(N));
        scan.close();
    }
}