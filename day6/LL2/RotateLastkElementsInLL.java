package day6.LL2;

import java.util.LinkedList;

public class RotateLastkElementsInLL {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(10);
        ll.addLast(20); 
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(50);
        System.out.println("Original Linked List:");
        System.out.println(ll);
        int k = 2;
        RotateLastkElementsInLL rotator = new RotateLastkElementsInLL();
        rotator.rotateLastKElements(k, ll);
        System.out.println("Linked List after rotating last " + k + " elements:");
        System.out.println(ll);
    }

    void rotateLastKElements(int k, LinkedList l1) {
        // Implementation for rotating last k elements in the linked list
        for(int i = 0; i < k; i++) {
            l1.addFirst(l1.get(l1.size() - 1));
            l1.remove(l1.size() - 1);
        }
    }
}
