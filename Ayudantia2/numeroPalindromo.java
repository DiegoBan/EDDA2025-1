import java.util.Scanner;

public class numeroPalindromo{
    public static boolean palindromo(int N){
        String numString = Integer.toString(N);
        int start = 0;
        int end = numString.length()-1;
        while(start < end){
            if(numString.charAt(start) != numString.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String arg[]){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Ingrese numero N: ");
        int N = scan.nextInt();
        System.out.println(palindromo(N));
        scan.close();
    }
}