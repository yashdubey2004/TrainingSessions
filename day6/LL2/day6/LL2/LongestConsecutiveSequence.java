package day6.LL2.day6.LL2;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {10, 4, 20, 1, 3, 2};
        HashSet<Integer> set = new HashSet<>();
        for(int num: arr) {
            set.add(num);
        }
        int longestStreak = 0;
        for(int num: arr) {
            if(!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
                while(set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }
                if(currentStreak > longestStreak) {
                    longestStreak = currentStreak;
            }
        }
    }
        System.out.println("Longest consecutive sequence length: " + longestStreak);
    }
}
