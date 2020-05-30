package DAO;

public class MyString {
	
	String str="ankita";
	
	public static void replace(String s) {
		
		System.out.println(s.replace('a','A'));
		System.out.println(s.replaceFirst("k", "K"));
		
	}
public static void main(String[] args) {
	MyString s = new MyString();
	s.fun();
	replace("ankita");
	byte b[] = {65,66,67,68,69};
	char c[] = new char[b.length];
	System.out.println(b.length);
	int i=0;
	for(byte bb:b) {
		System.out.print(bb);
		c[i++] = (char) bb;
		
	}
	for(char cc:c) {
		System.out.print(cc);
	}
}
private  void fun() {
	System.out.println(this.str);
	
}
}
