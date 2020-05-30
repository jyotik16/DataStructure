package DAO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StaticDemo {
   private static int x=10;
    private int a=10;
public static void main(String[] args) {
	//static int a=12; 
	//we can not declare the static variable inside block
	System.out.println("m->"+StaticDemo.x);
	fun();
	String str[] = { "Geeks", "for", "Geeks" }; 
    System.out.println(str.length); 
    //System.out.println(str[0].length); error
//	static int arr1[] = { 11, 22, 33 }; 
//    static int arr2[] = { 11, 22, 33, 44, 55 }; 
//    static int ptr[]; //error
    //int a=b=0;
	int arr1[] = { 11, 22, 33 }; 
     int arr2[] = { 11, 22, 33, 44, 55 }; 
     int ptr[]; 
    ptr = arr1; 
    arr1 = arr2; 
    arr2 = ptr;
    StaticDemo d =new StaticDemo();
    d.a=12; //static ,private or default variable can be direct access with instance
    System.out.print(arr1.length + " "); //5 
    System.out.println(arr2.length); //3
    
    //+++++++++++++++++++ OR case m if first cond is false then go to 2 cond
    //AND case m if first cond is true then go to 2 cond
    int a=11,b=5; 
    float c = 12.34f; 
    boolean x = a++ > 10 || ++b > 5;
    System.out.println("a="+a);
    System.out.println("b="+b);
    
    //****************8
    ArrayList<Integer> l = new ArrayList<Integer>();
    l.add(1); l.add(2); l.add(1);
    HashSet<Integer> h = new HashSet<>(l);
    List<Integer> m = Collections.synchronizedList(l);
    System.out.println(h);
    
}
private static void fun() {
	StaticDemo d =new StaticDemo();
	//static int a=12; 
	System.out.println("m-"+x);
	System.out.println("m-"+d.a); //private is not direct access
	
}
static {
	//static int a=12; 
	StaticDemo d =new StaticDemo();
	System.out.println("b="+d.x);
}
}
