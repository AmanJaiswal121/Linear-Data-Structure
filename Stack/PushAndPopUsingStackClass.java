package Stack;

import java.util.Stack;

public class PushAndPopUsingStackClass {
    public static void main(String[] args) {
        Stack<Integer> r = new Stack<>();
        System.out.println(r.empty());
        r.push(10);
        r.push(20);
        r.push(30);
        r.push(40);
        r.push(50);
        System.out.println(r);
        r.pop();
        System.out.println(r);
        System.out.println(r.empty());
    }
}
