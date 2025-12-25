package day4.JavaDSA1.Programs;

public class CheckSubsequenceInString {
    public static void main(String[] args) {
    String a = "abcde";
    String b = "adbc";
    int i = 0, j = 0;
    while(i < a.length() && j < b.length()){
        if(a.charAt(i) != b.charAt(j)){
            i++;
        }
        else{
            i++;
            j++;
        }
    }
    if(j == b.length()){
        System.out.print("Yes");
    }
    else{
        System.out.print("No");
    }
    }
    
}
