package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */
		Queue<Integer> q = new LinkedList<>();

		// Adds elements {0, 1, 2, 3, 4} to queue
		for (int i=0; i<5; i++)
			q.add(i);

		// Display contents of the queue.
		System.out.println("All elements-"+q);

		// To remove the head of queue.
		int eliminated = q.remove();
		System.out.println("eliminated-" + eliminated);

		System.out.println(q);

		// To view the head of queue
		int Queuehead = q.peek();
		System.out.println("queue head-" + Queuehead);

		// Rest all methods of collection interface,
		// Like size and contains can be used with this
		// implementation.
		int size = q.size();
		System.out.println("Size-" + size);

		for (Integer item: q) {
			System.out.println(item);
		}
	}

}
