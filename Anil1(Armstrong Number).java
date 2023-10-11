import java.util.Scanner;

public class Main {
	 
	 public static boolean isArmstrong(int n){
          int original = n;
		  int temp = n;
		 // first count the digit
		 int count = 0; 
		 while(n!=0){
			 int rem = n%10;
			 n = n/10;
			 count++;
		 }
		 
		 int sum = 0; 
		 while(temp!=0){
			 int rem = temp%10;
			 sum = sum+(int)Math.pow(rem,count);
			 temp = temp/10;
		 }
		 return original == sum;
	 }
	public static void main(String[] args) {
		// Write your code here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		boolean ans = isArmstrong(n);
		System.out.println(ans);

	}
}
