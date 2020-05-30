package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SortHashMap {
public static void main(String agrs[]) {
	
	HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
	 
    // Adding Key and Value pairs to HashMap
    hashmap.put(22,"A");
    hashmap.put(55,"B");
    hashmap.put(33,"Z");
    hashmap.put(44,"M");
    hashmap.put(99,"I");
    hashmap.put(88,"X");
    Set<Entry<Integer, String>> entries = hashmap.entrySet();
    Comparator<Entry<Integer, String>> valueComparator = new Comparator<Entry<Integer,String>>() {
        
        @Override
        public int compare(Entry<Integer, String> e1, Entry<Integer, String> e2) {
        	String v1 = e1.getValue();
            String v2 = e2.getValue();
            return v1.compareTo(v2);
        }
    };
    List<Entry<Integer, String>> listOfEntries = new ArrayList<Entry<Integer, String>>(entries);
    
    // sorting HashMap by values using comparator
    Collections.sort(listOfEntries, valueComparator);
         
    System.out.println("After Sorting:");
    LinkedHashMap<Integer, String> sortedByValue = new LinkedHashMap<Integer, String>(listOfEntries.size());
    
    // copying entries from List to Map
    for(Entry<Integer, String> entry : listOfEntries){
        sortedByValue.put(entry.getKey(), entry.getValue());
    }
}
private static void sortByValues(HashMap map) { 
	
}
}
