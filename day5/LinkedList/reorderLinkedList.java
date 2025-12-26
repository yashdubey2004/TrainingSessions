package day5.LinkedList;

// even first odd later

import java.util.LinkedList;


public class reorderLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println("Original List: " + list);
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 0) {
                int val = list.remove(i);
                list.addLast(val);
            }
        }
        System.out.println("Reordered List: " + list);
    }
}
