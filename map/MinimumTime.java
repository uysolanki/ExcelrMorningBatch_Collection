package day27.collection.map;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class MinimumTime {

	PriorityQueue<Integer> pqueue=new PriorityQueue<Integer>(Collections.reverseOrder());
	static int secoundCounter;
	public MinimumTime(int mango, int orange, int pineapple) {
		pqueue.add(mango);
		pqueue.add(orange);
		pqueue.add(pineapple);
	}
	public int calculateMinTime() {
		Iterator<Integer> list=pqueue.iterator();
		int j1,j2;
		while(!pqueue.isEmpty())
		{
			j1=0;
			j2=0;
			
			if(list.hasNext())
				j1= pqueue.remove();
			
			if(list.hasNext())
				j2= pqueue.remove();
			
			if(j1>0 && j2>0)
			{
				secoundCounter++;
				j1--;
				j2--;
			}
			
			if(j1>0 && j2==0)
			{
				secoundCounter=secoundCounter+j1;
				break;
			}
			
			if(j1==0 && j2>0)
			{
				secoundCounter=secoundCounter+j2;
				break;
			}
			
			if(j1>0)
				pqueue.add(j1);
			if(j2>0)
				pqueue.add(j2);
		}
		return secoundCounter;
	}
	
}
