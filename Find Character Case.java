import java.util.Scanner;
public class Solution {
    protected static int findCharCase(char c){
        if(c>97 && c <= 122) return 0;
        else if(c>65 && c <= 90) return 1;
        else return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        System.out.print(findCharCase(c));
        
    }
}