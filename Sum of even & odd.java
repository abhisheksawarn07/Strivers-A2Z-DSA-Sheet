import java.util.Scanner;
public class Main {
	static void oddEven(int n){
		int oddsum = 0;
		int evensum = 0; 
		while(n != 0){
			int ld = n%10;
			if(ld%2==0)evensum+=ld;
			else oddsum+=ld;
			n = n/10;

		}
		System.out.print(evensum+" "+oddsum);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		oddEven(n);

	}
}
