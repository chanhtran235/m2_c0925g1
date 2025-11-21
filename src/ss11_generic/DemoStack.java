package ss11_generic;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class DemoStack {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(10);
//        stack.push(15);
//        stack.push(20);
//        stack.push(30);
//
//        int size = stack.size();
//
////        for (int i = 0; i <size ; i++) {
////            System.out.println(stack.pop());
////        }
//        while (!stack.isEmpty()){
//            System.out.println(stack.pop());
//        }
        Queue<Integer> integers = new PriorityQueue<>();
        integers.add(6);
        integers.add(1);
        System.out.println(integers);
        integers.add(3);
        System.out.println(integers);
        System.out.println(integers.poll());
        System.out.println(integers);
        integers.add(5);
        System.out.println(integers);
    }
}
