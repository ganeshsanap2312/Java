package collectiondemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionTest {

	public static void main(String[] args) throws IOException {
		
//		HashMap<Integer, String> h = new HashMap<Integer, String>();
		
//		TreeMap<Integer, String> h = new TreeMap<>();

		LinkedHashMap<Integer, String> h = new LinkedHashMap<>();
		
		h.put(5, "ganesh");
		h.put(1, "ganesh");
		h.put(3, "ganesh");
		h.put(null, null);
		h.put(1, "sanap");
		h.put(null, null);
		h.put(6, null);
		h.put(6, "xyz");
		h.put(6, "abc");
		h.put(7, "ganesh");
		
		System.out.println(h);
//		
//		Set s = h.entrySet();
//		
//		Iterator i = s.iterator();
//		
//		while(i.hasNext())
//		{
//			Map.Entry e = (Entry) i.next();
//			
//			System.out.println("key is "+e.getKey()+"  value is "+e.getValue());
//			
//		}
//		
//		
//		FileOutputStream fos;
//		try {
//			fos = new FileOutputStream("hashmap.txt");
//			
//			ObjectOutputStream oos = new ObjectOutputStream(fos);
//			
//			oos.writeObject(h);
//			
//			oos.close();
//			fos.close();
//			
//			System.out.println("Serialized data is stored");
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		
		
		
		
	}

}
