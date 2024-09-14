package CollectionExamples;

import java.util.*;

public class QueueExample {

	
	public static void PriorityQueueMethod() {
		PriorityQueue que = new PriorityQueue();
		que.add(10);
		que.add(11);
		que.add(12);
		que.add(13);
		que.add(14);
		que.add(15);
		System.out.println("Head :- "+que.element());
		System.out.println("Head :- "+que.peek());
		System.out.println("--------------Queue Elements----------");
		Iterator itr = que.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		que.remove();
		que.poll();
		System.out.println("--------------Queue Elements After remove() and poll() methods----------");
		itr = que.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
	
	
	public static void DequeMethod1() {
		Deque dque = new ArrayDeque();
		dque.add(10);
		dque.offer(11);
		dque.offerLast(12);
		dque.offerFirst(13);
		dque.add(14);
		dque.add(15);
		System.out.println("Head :- "+dque.element());
		System.out.println("Head :- "+dque.peek());
		System.out.println("--------------Queue Elements----------");
		Iterator itr = dque.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		dque.remove();
		dque.pollLast();
		System.out.println("--------------Queue Elements After remove() and pollLast() methods----------");
		itr = dque.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(":::::::::::::Priority Queue:::::::::::::::::::");
		PriorityQueueMethod();
		
		System.out.println(":::::::::::::Deqeue:::::::::::::::::::");
		DequeMethod1();
	}

}
