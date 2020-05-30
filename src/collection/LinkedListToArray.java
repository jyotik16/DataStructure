package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListToArray {
public static void main(String[] args) {
	
	LinkedList<String> list = new LinkedList<>();
	list.add("A");
	list.add("B");
	list.add("C");
	list.add("D");
	list.add("E");
	
	List<String> list2 = new ArrayList<String>(list);
	for(String str:list2) {
		System.out.print(str+" ");
	}
	list2.removeAll(list2);
	System.out.println(" "+list2.size());
}
}
