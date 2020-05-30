package Strings;

import java.util.Scanner;

public class findTheWords {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int j=0;j<t;j++){
		    int n=s.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=s.nextInt();
		    }
		    String str[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		    StringBuffer st=new StringBuffer();
		    printAllStrings(arr,str,st,0);
		    System.out.println();
		}
	}
	static void printAllStrings(int[] arr,String[] str,StringBuffer s,int c){
        if(c==arr.length){
            System.out.print(" s="+s+"|");
            return;
        }
        String st=str[arr[c]];
        //System.out.print(" st ="+st.length()+" ");
        for(int i=0;i<st.length();i++){
            s.delete(c, s.length());
            //System.out.print("s="+s+"|");
          //  System.out.print("["+c+","+s.length()+","+i+"]"+s+" ");
            printAllStrings(arr,str,s.append(st.charAt(i)),c+1);
          //  System.out.println("["+c+","+s.length()+","+i+"]"+s+" ");
   
       }
	}
}
/*The first line of input contains an integer T denoting the number of test cases. T testcases follow. Each testcase contains two lines of input. The first line of each test case is N, N is the number of digits. The second line of each test case contains D[i], N number of digits.

Output:
Print all possible words from phone digits with single space in lower case.

Constraints:
1 <= T <= 10
1 <= N <= 10
2 <=  D[i] <= 9

Example:
Input:
1
3
2 3 4

Output:
adg adh adi aeg aeh aei afg afh afi bdg bdh bdi beg beh bei bfg bfh bfi cdg cdh cdi ceg ceh cei cfg cfh cfi
*/