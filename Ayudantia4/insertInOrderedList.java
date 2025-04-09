import java.util.Scanner;

public class insertInOrderedList{
    public static class linkedlist{
        Node head;
        public class Node{
            int value;
            Node next;
            Node(int value){
                this.value = value;
                next = null;
            }
            Node(int value, Node next){
                this.value = value;
                this.next = next;
            }
        }
        linkedlist(){
            head = null;
        }
        void insert(int value){
            Node nuevo = new Node(value);
            if(head == null || value < head.value){
                nuevo.next = head;
                head = nuevo;
                return;
            }

            Node actual = head;
            while(actual.next != null && actual.next.value <= value){
                actual = actual.next;
            }
            nuevo.next = actual.next;
            actual.next = nuevo;
        }
        void print(){
            Node aux = head;
            System.out.printf("Lista: ");
            while(aux != null){
                System.out.printf("%d -> ", aux.value);
                aux = aux.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        linkedlist LL = new linkedlist();
        int aux = 1;
        int val;
        while (aux == 1) {
            System.out.printf("¿Desea ingresar un numero?\n1 = si\ncualquier otro = no\n");
            aux = scan.nextInt();
            if(aux == 1){
                System.out.printf("Numero a ingresar: ");
                val = scan.nextInt();
                LL.insert(val);
                LL.print();
            }else break;
        }
        scan.close();
    }
}