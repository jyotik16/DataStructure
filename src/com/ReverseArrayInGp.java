package com;
import java.io.BufferedReader;
import java.io.InputStreamReader;

//2
//5 3
//1 2 3 4 5
//6 2
//10 20 30 40 50 60
//
//Output
//3 2 1 5 4
//20 10 40 30 60 50


class ReverseArrayInGp {
	public static void main (String[] args) throws Exception
	{
	BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
	int t=Integer.parseInt(ob.readLine());
	for(int i=0;i<t;i++)
	{
	String[] str1=ob.readLine().split(" ");
	int n=Integer.parseInt(str1[0]);
	int c=Integer.parseInt(str1[1]);
	int arr[]=new int[n];
	String[] s=ob.readLine().split(" ");
	for(int j=0;j<n;j++){
	arr[j]=Integer.parseInt(s[j]);  
	}
	for(int j=0;j<n;j+=c)
	{
	    int left=j;
	    int right=Math.min(n-1,j+c-1);
	    while(left<right)
	    {
	        int temp=arr[left];
	        arr[left]=arr[right];
	        arr[right]=temp;
	        left++;
	        right--;
	    }
	}
	StringBuffer str = new StringBuffer();
	for(int j=0;j<n;j++)
	str.append(arr[j]+" ");
	System.out.println(str);
	}
	}}