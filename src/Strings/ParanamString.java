package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParanamString {
	public static void main (String[] args) throws IOException
	 {
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  int t=Integer.parseInt(br.readLine());
	  while(t-->0)
	  {
	    String s=br.readLine().trim();
	    
	    System.out.println(checkPanagram (s)==true?1:0);
	  }
	  
	 }
	public static boolean checkPanagram  (String s)
    {
    int index=0;
    boolean arr[]=new boolean[26];
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
            index=s.charAt(i)-'A';
        }
        else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
            index=s.charAt(i)-'a';
        }
        else{
            continue;
        }
        arr[index]=true;
    }
    int c=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==true){
          c+=1;  
        }
    }
    if(c==26){
        return true;
    }
    return false;
}
}
/*
Input:
2
Bawds jog, flick quartz, vex nymph
sdfs
Output:
1
0

Explanation :
Testcase 1: In the given input , 
there are all the letters of the english alphabet.Hence, the output is 1.
Testcase 2: In the given input , 
there aren't all the letters present in the english alphabet. Hence, the output is 0.
*/