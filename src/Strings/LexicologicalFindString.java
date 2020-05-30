package Strings;

import java.util.Scanner;

public class LexicologicalFindString {
	public static void main (String[] args)
	{
	    Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int n = s.nextInt();
            s.nextLine();
            String[] strs = s.nextLine().trim().split(" ");
            String max = strs[0];
            String min = strs[0];
            for(int i=1;i<strs.length;i++){
                max = max(max, strs[i]);
                min = min(min, strs[i]);
            }
            System.out.println(min +" "+ max);
        }
	} 
	static String max(String s1,String s2){
	    int i=0,j=0;
	    int n1 = s1.length();
	    int n2 = s2.length();
	    for(i=0;i<Math.min(n1,n2);i++){
	        char c1 = s1.charAt(i);
	        char c2 = s2.charAt(i);
	        if(c1>c2){
	            return s1;
	        }
	        if(c2>c1){
	            return s2;
	        }
	    }
	    if(n1>n2){
	        return s1;
	    }else{
	        return s2;
	    }
	}
	static String min(String s1,String s2){
	    int i=0,j=0;
	    int n1 = s1.length();
	    int n2 = s2.length();
	    for(i=0;i<Math.min(n1,n2);i++){
	        char c1 = s1.charAt(i);
	        char c2 = s2.charAt(i);
	        if(c1>c2){
	            return s2;
	        }
	        if(c2>c1){
	            return s1;
	        }
	    }
	    if(n1>n2){
	        return s2;
	    }else{
	        return s1;
	    }
	}
}
/*
Input

3
3
a ab abc
3
a a b
3
z xy t

Output

a abc
a b
t z
*/