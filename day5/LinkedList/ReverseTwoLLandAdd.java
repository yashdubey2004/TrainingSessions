package day5.LinkedList;

import java.util.LinkedList;

public class ReverseTwoLLandAdd {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(7);
        list1.add(5);
        list1.add(9);
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(2);
        list2.add(4);
        list2.add(3);
        LinkedList<Integer> result = addTwoLists(list1, list2);
        
    }
}
