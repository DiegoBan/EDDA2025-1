import java.util.Scanner;
import java.util.Stack;

public class posfijo{
    public static int sol(String values){
        Stack<Integer> nums = new Stack<>();
        int a;
        for(int i = 0 ; i < values.length() ; i++){
            char x = values.charAt(i);
            switch (x) {
                case '+':
                    a = nums.pop() + nums.pop();
                    nums.push(a);
                    break;
                case '-':
                    a = nums.pop() - nums.pop();
                    nums.push(a);
                    break;
                case '*':
                    a = nums.pop()*nums.pop();
                    nums.push(a);
                    break;
                case '/':
                    a = nums.pop()/nums.pop();
                    nums.push(a);
                    break;
                case ' ':
                    continue;
                default:
                    nums.push(Integer.parseInt(String.valueOf(x)));
                    break;
            }
        }
        return nums.pop();
    }
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Ingrese cadena: ");
        String values = scan.nextLine();
        System.out.printf("Resultado: %d\n", sol(values));
        scan.close();
    }
}