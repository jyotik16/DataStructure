package Basic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PthyogorusTriplet {

	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		 int t = sc.nextInt();
		 while (t > 0) {
		        int n = sc.nextInt();
		        int[] arr = new int[n];
		        
		        for (int i = 0; i < n; i++) {
		            int item = sc.nextInt();
		            arr[i] = item * item;
		        }
		        
		        Arrays.sort(arr);
		        if (pytha(arr)) {
		            System.out.println("Yes");
		        }
		        else {
		            System.out.println("No");
		        }
		        //System.out.println(pytha(arr));
		        ALLPytha(arr);
		        t--;
		    }
	}
	public static void ALLPytha(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> ar = new ArrayList<>();
        ArrayList<ArrayList<Integer>> br = new ArrayList<>();
        for (int i = n - 1; i >= 2; i--) {
	        int l = 0;
	        int r = i - 1;
	        while (l < r) {
                if (arr[l] + arr[r] == arr[i]) {
                	ar.add(arr[l]);
                	ar.add(arr[r]);
                	ar.add(arr[i]);
                	//System.out.println(ar);
                	br.add(ar);
                	                  
                }
                if (arr[l] + arr[r] < arr[i]) {
                    l++;
                }
                else {
                    r--;
                }
	        }
	        ar = new ArrayList<>();
	   }
        System.out.println(br);
	   
    }
	
	public static boolean pytha(int[] arr) {
        int n = arr.length;
        for (int i = n - 1; i >= 2; i--) {
	        int l = 0;
	        int r = i - 1;
	        while (l < r) {
                if (arr[l] + arr[r] == arr[i]) {
                    return true;
                }
                if (arr[l] + arr[r] < arr[i]) {
                    l++;
                }
                else {
                    r--;
                }
	        }
	   }
	   return false;
    }

}


/*
Input:
1
5
3 2 4 6 5

Output:
Yes

Explanation:
Testcase 1: a=3, b=4, and c=5 forms a pythagorean triplet, so we print "Yes"
*/