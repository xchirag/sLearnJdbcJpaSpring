package threadExample;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

//public class MyThread extends Thread{
//	
//	
//
//}



// how to start with extends Thread // this is not the best way because they cannot extend any other class!
// extends Thread can be start with 
// threadName.start()
// must override run method

// how to start with Runnable interface // this is better way compare to above and start/run => as under!
// therefore better to use implements Runnable
// Thread t = new Thread (new Runnable())
//Thread myThread = new Thread(new Runnable());


/* keyd? => map/sortedmap
 * 
 * unique? => set/sortedSet
 * 
 * order impo? => Queue (fifo) Deque (Lifo)
 * 
 * order not important => List
 *
 * 
 * Collection interface
 * 
 * Set (hashSet, linkedHashSet, sortedSet)
 * 
 * Queue (Priority queue, ArrayDeque)
 * 
 * List (vector, ArrayList, LinkedList)
 * 
 * Map (HashTable, TreeMap,HashMap,  LinkedHashMap)
*/


public class MyThread {
	
	Product p = new Product();
	
	public static void main(String[] args) {
		
		Map<Integer, String> myHashMap = new HashMap<>();
		Map<String, String> myTreeMap2 = new TreeMap<>();
		Map<Double, String> myHashTable = new Hashtable<>();
		Map<Integer, Product> myLinkedHashMap = new LinkedHashMap<>();
		HashMap<Integer, Product> hasmap3 = new HashMap<>(); /// this will work but passing from one to another will be difficult
		
		
		List<Product> myArrayList = new ArrayList<>();
		List<String> myLinkedList = new LinkedList<>();
		List<Product> myVector = new Vector<>();
		
		Queue<Product> myPriorityQueue = new PriorityQueue<Product>();
//		Queue<String> myDeque = new Deque<String>() {
//			//must implement inherited method
//		};
		
		Set<Product> myHashSet = new HashSet<>();
		Set<String> myTreeSet = new TreeSet<>();
		Set<Integer> myLinkedHashSet = new LinkedHashSet<>();
		
		Set<Entry<String, String>> entrySet = myTreeMap2.entrySet();
		
		
		// java8 in 2014 and one of the biggest update of java!
		
		
		String sp;
		String qp;
		sp = null;
		qp = null;
		
		while (true) {
			int x, y;
			
			try {
				Scanner s = new Scanner(System.in);
				sp = s.nextLine();
				qp = s.nextLine();

				x = Integer.parseInt(sp);
				y = Integer.parseInt(qp);
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("both numbers should be integers");
				continue;
			} finally {
				//System.out.println(sp+ "    "+ qp);

			}
			
			System.out.println();
			System.out.println(sp+ "    "+ qp);
			
		}
		
	
		
	}
}