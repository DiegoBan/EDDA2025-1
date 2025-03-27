import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class factoresPrimos{
    public static List<Integer> factores(int N){
        List<Integer> factores = new ArrayList<>();
        if(N == 1) return factores;
        //  Dividir por 2 mientras sea par
        while(N%2 == 0){
            factores.add(2);
            N /= 2;
        }
        //  Probar numeros impares desde 3 hasta raíz N
        for(int i = 3 ; i*i <= N; i += 2){
            while(N%i == 0){
                factores.add(i);
                N /= i;
            }
        }
        //  Numeros que queden (si es que quedan)
        if(N > 1){
            factores.add(N);
        }

        return factores;
    }
    public static void printList(List<Integer> x){
        for(int i : x){
            System.out.printf("%d ",i);
        }
        System.out.printf("\n");
    }
    public static void main(String arg[]){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Ingrese numero N: ");
        int N = scan.nextInt();
        printList(factores(N));
        scan.close();
    }
}