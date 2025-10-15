package StackOfArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StackArray s = new StackArray(5);
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Peek");
        System.out.println("4. Display");
        System.out.println("5. Exit");
        int ch = sc.nextInt();
        switch (ch){
            case 1:
                System.out.println("Enter a num : ");
                int num = sc.nextInt();
                s.push(num);
                break;
            case 4:
                s.print();
                break;
            default:
                System.out.println("Wrong");
        }
    }
}
