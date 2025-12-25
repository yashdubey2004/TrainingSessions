package day4.JavaDSA1.Programs;

public class AllCombinationsOfabc {
    static void printss(String s, String curr, int index, int n){
        if(index == n){
            System.out.print(curr + " ");
            return;
        }
        printss(s, curr + s.charAt(index), index+1, n);
        printss(s, curr, index+1, n);
    }

    public static void main(String[] args) {
        String s = "yash";
        int n = s.length();
        printss(s, "", 0, n);
    }
}
