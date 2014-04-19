package lang.tij4.holding;

import lang.tij4.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        for (String s : "My dog has fleas".split(" ")) {
            stack.push(s);
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// fleas has dog My                               //
////////////////////////////////////////////////////
