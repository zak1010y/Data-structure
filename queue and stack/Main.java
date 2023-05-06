package dataStructure.week_6;

import Stack.main;

public class Main {
    public static void main(String[] args) {

        queue2 q1 = new queue2(10);
        q1.add(5);
        q1.add(2);
        q1.add(1);
        q1.remove();
        System.out.println(q1.isImpty());
        System.out.println(q1.isFull());
        q1.last_element();
    }
}
