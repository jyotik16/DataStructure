package com;
import java.util.Scanner;


class FindClosetNum {
	public static void main (String[] args) {
		//code
		Scanner s=new Scanner(System.in);
		/*2
4 4
1 3 6 7
7 4
1 2 3 5 6 8 9

Output:
3
5*/
		int t=s.nextInt();
		while(t-- >0){
		    int n=s.nextInt();
		    int k=s.nextInt();
		    int[] a=new int[n];
		    for(int i=0;i<n;i++){
		        a[i]=s.nextInt();
		    }int close=0;
		    if(a[0]==k)
		    close=a[0];
		    else if(a[n-1]==k)
		    close=a[n-1];
		    else
		    close=find(a,0,n-1,k);
		    System.out.println(close);
		}
	}
	static int find(int[] a,int low,int high,int k){
	    int mid=(low+high)/2;
	    if(low<high){
	    if(a[mid]==k)
	    return a[mid];
	    else if(a[mid]<k){
	        if(mid<high && a[mid+1]>k)
	        return findClosest(a[mid],a[mid+1],k);
	    low=mid+1;
	    //return find(a,mid+1,high,k);
	    }
	    else if(a[mid]>k){
	        if(mid>low && a[mid-1]<k)
	         return findClosest(a[mid-1],a[mid],k);
	    high=mid-1;
	    //return find(a,low,mid-1,k);
	    }
	    return find(a,low,high,k);
	}return a[mid];
	}
	static int findClosest(int a,int b,int k){
	    if(k-a >= b-k)
	    return b;
	    else
	    return a;
	}
}