package com;

import java.util.Arrays;
import java.util.Scanner;

public class SortInSpecficOrder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		while(tc-->0)
		{
		    int l=sc.nextInt();
		    int[] a=new int[l];
		    for(int i=0;i<l;i++)
		    a[i]=sc.nextInt();
		    
		    Arrays.sort(a);
		    for(int i=l-1;i>=0;i--)
		    {if(a[i]%2==1)
		    System.out.print(a[i]+" ");
		    }
		    
		    for(int i=0;i<l;i++)
		    {
		        if(a[i]%2 ==0)
		        System.out.print(a[i]+" ");
		    }
		    System.out.println();
		}

	}

}
/*Input:
2
7
1 2 3 5 4 7 10
7
0 4 5 3 7 2 1

Output:
7 5 3 1 2 4 10
7 5 3 1 0 2 4

Explanation:
Testcase1: Array elements 7 5 3 1 are odd and sorted in descending order, 
whereas 2 4 10 are even numbers and sorted in ascending order.
*/