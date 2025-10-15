package StackOfArray;

public class StackArray {
    int[] stack;
    int size,top;
    StackArray(int s){
        size = s;
        stack = new int[size];
        top = -1;
    }
    void push(int val){
        top += 1;
        stack[top] = val;
    }
    void print(){
        for(int i = top; i >= 0; i--){
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
    void peek(){
        System.out.println("Peek : " + stack[top]);
    }
    void pop(){
        stack[top] = 0;
        top -= 1;
        System.out.println("Top value is removed !!");
    }


}
