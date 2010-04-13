package org.gljug;

import java.util.concurrent.LinkedBlockingQueue;

public class Tst03BoundedQueue {

	public static void main(String[] args) {
		// using a bounded blocking queue
		// file:///home/yonghow/files/docs/greaterlansingjug/tigerAndBeyond/javadocs/api/java/util/concurrent/LinkedBlockingQueue.html
		LinkedBlockingQueue<Integer> q = new LinkedBlockingQueue<Integer>(3);
		
		addToQueue(q, 1); // autoboxing at work here		
		addToQueue(q, 2);		
		addToQueue(q, 3);		
		addToQueue(q, 4);
		
		pollAll(q);
	}

	private static void pollAll(LinkedBlockingQueue<Integer> q) {
		System.out.println();
		Integer output = 0;
		
		do {
			StringBuffer sb = new StringBuffer();
			sb.append(" queue size before : " + q.size());
						
			output = q.poll();
			
			sb.append(" queue size after : " + q.size());
			sb.append(" ... output after polled : " + output);
			System.out.println (sb.toString());
			
		} while (output!=null);
		
	}

	private static void addToQueue(LinkedBlockingQueue<Integer> q, Integer o) {
		boolean success = false;
		System.out.println("\nadding " + o);
		try{
			success = q.add(o); // the normal method adding to a collection queue
			
			// the new method for LinkingBlocking queue
			// no exception thrown
			// file:///home/yonghow/files/docs/greaterlansingjug/tigerAndBeyond/javadocs/api/java/util/concurrent/LinkedBlockingQueue.html
//			success = q.offer(o); 			
			
		} catch (Exception e)
		{
			System.out.println ("\n\n  ---*** Caught Exception : " +e.getMessage() + " ***--- \n\n");
		}
		System.out.println ("     '" + o + "' is adding to queue successful : " + success);
	}
}
