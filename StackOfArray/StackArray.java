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
    int pop(){
        if(top == -1){
            System.out.println("Empty");
            return -1;
        }
        else{
            int a = stack[top];
            top -= 1;
            return a;
        }
    }
    StackArray separateEven(StackArray evenStack){
        if(top == -1){
            System.out.println("Empty Stack");
            return null;
        }
        else{
            for(int i = top; i >= 0; i--){
                int k = pop();
                if(k % 2 == 0){
                    evenStack.push(k);
                }
            }
            return evenStack;
        }
    }
    void reverseString(String name){

    }

}
