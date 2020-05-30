package Strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class MinimumChanges {
	public static int calculateChange(String str)
    {
        HashSet<Character> hs = new HashSet<Character>();
        int result=0;
        for(int k=0;k<str.length();++k)
        {
            if(hs.contains(str.charAt(k)))
            {
                ++result;
                //System.out.println("result "+result);
            }
            else
            {
                hs.add(str.charAt(k));
                //System.out.println("Added"+str.charAt(k));
            }
        }
        return result;
    }
	public static void main (String[] args)
	 {
	    int t=0;
	    Scanner sc = new Scanner(System.in);
	    t=sc.nextInt();
	    ArrayList<Integer> arrResult = new ArrayList<Integer>();
	    for(int i=0;i<t;++i)
	    {
	        String str = sc.next();
	        //System.out.println(str);
	        //StringBuffer strBuffer = new StringBuffer();
	        //strBuffer.append(sc.nextLine());
	        int minChange = calculateChange(str);
	        //System.out.println("min "+minChange);
	        arrResult.add(minChange);
	    }
	    for(int j=0;j<arrResult.size();++j)
	    {
	        if(j>0){
	            System.out.print("\n");
	        }
	        System.out.print(arrResult.get(j));
	    }
	 }
}
/*
Input
3
aab
aebaecedabbee
ab

Output
1
8
0

Explanation
Testcase 1: If we change one instance of 'a' to any character from 'c' to 'z', we get all distinct substrings.
Testcase 2:  We need to change 2 a's, 2 b's and 4 e's to get distinct substrings.
Testcase 3: As no change is required hence 0.
*/