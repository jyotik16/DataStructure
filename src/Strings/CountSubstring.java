package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class CountSubstring {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
     String s = sc.nextLine();	
     String p = sc.nextLine();
     f2(p,s);
}

static void f2(String pat,String txt) {
	 int M = pat.length();         
     int N = txt.length();         
     int res = 0; 
     for (int i = 0; i <= N - M; i++) { 
         /* For current index i, check for pattern match */
         int j;             
         for (j = 0; j < M; j++) { 
             if (txt.charAt(i + j) != pat.charAt(j)) { 
                 break; 
             } 
         } 

         // if pat[0...M-1] = txt[i, i+1, ...i+M-1]  
         if (j == M) {                 
             res++;                 
             j = 0;                 
         }             
     }   
	System.out.println(res);
}
static void f1(String s) {
	int p1=0,p2=0,p3=0,p4=0,p5=0,p6=0;
    char ch[] = s.toCharArray();
    for(int i=0;i<ch.length;i++)
    {
        if(ch[i]=='a')
        p1++;
        if(ch[i]=='e')
        p2++;
        if(ch[i]=='h')
        p3++;
        if(ch[i]=='r')
        p4++;
        if(ch[i]=='t')
        p5++;
        if(ch[i]=='k')
        p6++;
    }
    p1=(int)(p1/2);
    p2=(int)(p2/2);
    p3=(int)(p3/2);
    p4=(int)(p4/2);
    int arr[] = {p1,p2,p3,p4,p5,p6};
    Arrays.sort(arr);
    for(int i=0;i<arr.length;i++) {
    	System.out.println(arr[i]);
    }
    int res=arr[0];
    System.out.println(res);
}
}
