package com;

import java.util.HashMap;
import java.util.Scanner;

public class CountDistinct {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr_len=sc.nextInt();
		int k=sc.nextInt();
		int []ar = new int[arr_len];
		for(int i=0;i<arr_len;i++) {
			ar[i]=sc.nextInt();
		}
		countDistinct(ar,k,arr_len);
	}	
	static void countDistinct(int a[], int k, int n)
    {
	// Your code here
	HashMap<Integer,Integer> hm=new HashMap();
	for(int i=0;i<n;i++){
	    hm.put(a[i],i);
	    if(i==k-1)
	    System.out.print(hm.size()+" ");
	    if(i>=k){
	        if(hm.get(a[i-k])==i-k)
	        hm.remove(a[i-k]);
	        System.out.print(hm.size()+" ");
	    }
	}
    }
}

/*
Example(To be used only for expected output):
Input:
2
7 4
1 2 1 3 4 2 3
3 2
4 1 1

Output:
3 4 4 3
2 1*/