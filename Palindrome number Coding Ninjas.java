import java.util.Scanner;
public class Solution {
	private static boolean palindromeNum(int n){
		String str = String.valueOf(n);
		int i =0 ;
		int j = str.length()-1;
		while(i<j){
			if(str.charAt(i)!=str.charAt(j)) return false;
			i++;j--;
		}return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(palindromeNum(n));
	}
}