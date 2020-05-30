package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class caseSpeficSort {
	public static String caseSort(String str) {
        // Your code here
        // Your code here
        Queue<Character> lower = new PriorityQueue<>();
        Queue<Character> upper = new PriorityQueue<>();
        
        for(int i = 0; i < str.length(); ++i) {
            
            if(Character.isLowerCase(str.charAt(i)))
                lower.add(str.charAt(i));
            else
                upper.add(str.charAt(i));
        }
        
        String ans = "";
        
        for(int i = 0; i < str.length(); ++i) {
            char c = str.charAt(i);
            
            if(Character.isLowerCase(c))
                ans += lower.remove();
            else
                ans += upper.remove();
        }
        
        return ans;
    
    }
// { Driver Code Starts.


    
	public static void main (String[] args) {
		
    	try {
    	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	    String[] words = br.readLine().split("\\s+");
    	    int numTestCases = Integer.parseInt(words[0]);
    	    
    	    for (int tIdx = 0; tIdx < numTestCases; tIdx++) {
    	        words = br.readLine().split("\\s+");
    	        int size = Integer.parseInt(words[0]);
    	        String str = br.readLine();
    	        String sortedStr = caseSort(str);
    	        System.out.println(sortedStr);
    	    }
    	}
    	catch (IOException e) {
    	    System.out.println(e);
    	}
	}
}
/*
 * 
 * Input:
2
12
defRTSersUXI
6
srbDKi
Output:
deeIRSfrsTUX
birDKs

Explanation:
Testcase 1: Sorted form of given string with the 
same case of character as that in original string.
Testcase 2: Sorted form of given string with the 
same case of character will result in output as birDKs.
*/
