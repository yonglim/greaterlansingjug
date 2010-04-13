package org.gljug;

import java.util.concurrent.LinkedBlockingQueue;

public class Tst04ConcurrentQueue {
	public static void main(String[] args) throws InterruptedException {
		
		Server server = new Server();
		server.start();

		for (int i=0; i<4; i++) {
			Thread.sleep(500);
			System.out.println ( "Sending to server : " + i);
			server.accept(i);
		}


	}
}

class Server extends Thread {
	   static final int CAPACITY = 2;
	   static final int SLEEP_SECOND = 8;
	   public Server () {
		   System.out.println ("Starting server with a queue capacity of "
				   + CAPACITY + " and " + SLEEP_SECOND + " second of sleep between process ");
	   }
	   
	   // file:///home/yonghow/files/docs/greaterlansingjug/tigerAndBeyond/javadocs/api/java/util/concurrent/LinkedBlockingQueue.html
	   private LinkedBlockingQueue<Integer> queue =
	      new LinkedBlockingQueue<Integer>(CAPACITY);
	   
	   public void accept(Integer i) {
	      try {
	    	 
	    	 System.out.println("    ----> " + i + " waiting to be put on to the queue");
	    	 
	         queue.put(i); // will wait till there are space in the queue
	         
	         System.out.println("    ----> " + i + " added to the queue");
	         
	      }
	      catch (InterruptedException e) {
	         throw new RuntimeException("add to queue interrupted");
	      }
	   }

	   public Integer process() {
		   Integer i = null;
		   try {
			   System.out.println("    <---- " + " Waiting for element to process");	
			   
			   i = queue.take(); // will wait till there are some element to take from the queue 
			   
			   System.out.println("    <---- " + " Processed number " + i );
			   
		   } catch (InterruptedException e) {
			   throw new RuntimeException("add to queue interrupted");
		   }	
		   return i;
	   }

	   public void run() {
		   while (true)
		   {
			   try {
				   System.out.println ("    ***** Server start to sleep for " + SLEEP_SECOND + " seconds -- ");
				   Thread.sleep(SLEEP_SECOND * 1000);
				   System.out.println ("    ***** Server awake ready to process -- ");
				   
				   process();
				   
			   } catch (InterruptedException e) {
				   e.printStackTrace();
			   }

		   }
	   }

}