package day27.collection.map;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> queue=new PriorityQueue<>(Collections.reverseOrder());
		queue.add(10);
		queue.add(15);
		queue.add(5);
		queue.add(30);
		queue.add(20);
		
		int i=1;
		while(i<=3)
		{
		System.out.println("Offer Number "+ i +": " +queue.remove());
		i++;
		}

	}

}
