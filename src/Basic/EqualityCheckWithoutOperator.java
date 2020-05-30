package Basic;

public class EqualityCheckWithoutOperator {

	public static void main(String[] args) {
		int a=5; int b=9;
		
		//if((a^b)!=0)
		if ( (a & ~b)==0 )  
			System.out.println("same!");
		else
			System.out.println("Not same!");
	}
}
