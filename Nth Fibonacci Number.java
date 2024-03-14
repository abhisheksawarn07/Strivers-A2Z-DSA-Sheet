import java.util.Scanner;
public class Solution {
	protected static int fibonacciNum(int n){
		if(n==1 || n==2) return 1;
		return fibonacciNum(n-1)+fibonacciNum(n-2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(fibonacciNum(n));
		
	}

}
