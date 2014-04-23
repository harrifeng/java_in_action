package lang.tij4.holding;

import java.util.Stack;

public class StackCollision {

    public static void main(String[] args) {
        lang.tij4.util.Stack<String> stack = new lang.tij4.util.Stack<String>();
        for (String s : "My dog has fleas".split(" ")) {
            stack.push(s);
        }

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();

        java.util.Stack<String> stack2 = new Stack<String>();
        for (String s : "My dog has fleas".split(" ")) {
            stack2.push(s);
        }

        while (!stack2.empty()) {
            System.out.print(stack2.pop() + " ");
        }
    }

}
////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// fleas has dog My                               //
// fleas has dog My                               //
////////////////////////////////////////////////////
