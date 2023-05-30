package lesson14;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private List<T> list;

    public Stack() {
        list = new ArrayList<>();
    }

    public void push(T element) {
        list.add(element);
        System.out.println("Added element --> " + element);
    }

    public T pop() throws Exception {
        if (list.isEmpty()) {
            throw new Exception("Stack is empty");
        }
        int index = list.size()-1;
        T poppedElement = list.get(index);
        list.remove(index);
        System.out.print("Popped element --> ");
        return poppedElement;
    }
}

class Main {
    public static void main(String[] args) throws Exception {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(8);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
