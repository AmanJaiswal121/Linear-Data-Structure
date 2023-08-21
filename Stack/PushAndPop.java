package Stack;

import java.util.Scanner;

public class PushAndPop {
    int stack[];
    int top;
    int capacity;

    PushAndPop(int size) {
        stack = new int[size];
        top = -1;
        capacity = size;
    }

    void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack is already full");
        } else {
            top++;
            stack[top] = value;
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            top--;
        }
    }

    void search(int sec) {

        if (stack[top] == sec) {
            System.out.println(stack[top]);
        } else {
            System.out.println("Not found");
        }
    }

    void display() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PushAndPop r = new PushAndPop(5);
        r.push(10);
        r.push(20);
        r.push(30);
        r.push(40);
        r.push(50);
        r.display();
        r.pop();
        r.display();
        r.search(1);
        r.display();
    }
}
