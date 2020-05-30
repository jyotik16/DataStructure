package com;

public class StringManipulation {

	public static void main(String args[]) {
	
		String ss ="abc def";
		String ans="";
		String subans="";
		
		for(int i=ss.length()-1;i>=0;i--) {
			
			char ch =ss.charAt(i);
			if(ch!=' ') {
				subans = subans+ch;				
			}
			if(i==0){
				ans= ans+subans;
			}
			if(ch==' ')  {				
				subans = subans+ch;
				ans= ans+subans;				
				subans="";
			}
			
		}
		System.out.println(" new :"+ans);
	}
	
}
