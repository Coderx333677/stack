package StackOfArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StackArray s = new StackArray(5);
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("-".repeat(50));
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Separate Even");
            System.out.println("6. Exit");
            int ch = sc.nextInt();
            switch (ch){
                case 1:
                    System.out.print("Enter a num : ");
                    int num = sc.nextInt();
                    s.push(num);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.peek();
                    break;
                case 4:
                    s.print();
                    break;
                case 5:
                    StackArray evenStack = new StackArray(s.top);
                    StackArray ans = s.separateEven(evenStack);
                    ans.print();
                    break;
                case 6:
                    System.exit(0);
                    break;
                case 7:
                    s.reverseString("Maaz Abbas");
                    break;
                default:
                    System.out.println("Wrong");
            }
        }
    }
}
