package DAO;

public class WithoutLoop {

	public static void main(String[] args) {
		
		int n=10;
		//print(n);
		decimaltobinary(n);
	}

	private static void decimaltobinary(int n) {
		int rem=0,sum=0,mul=1; 
		
		while(n>0) {
			rem = n%2;
			sum = sum+(mul*rem);
			n = n/2;
			mul = mul*10;
		}
		System.out.println(sum);
	}

	private static void print(int n) {
		
		if(n==11)
			return;
		System.out.print(n+" ");
		print(n+1);
		System.out.print(n+" ");
	}

	
}
