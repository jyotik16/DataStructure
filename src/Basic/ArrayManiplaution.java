package Basic;

public class ArrayManiplaution {

	public static void main(String[] args) {
	
		int []ar = {1,2,3,4,5,6};
		fun(ar); //1 6 2 5 3 4
	}

	private static void fun(int []ar) {
	int left=0; int right=ar.length-1; int c=0;
		
			
			while(left<=right ) {
				if(c%2==0)
					{
					System.out.print(ar[left]+" ");
					left++;
					}
				else
					{
					System.out.print(ar[right]+" ");
					right--;
					}
				
				
				c++;
				
			}
		
		}
	
}
