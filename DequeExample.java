package Anudip;

import  java.util.ArrayDeque;
public class DequeExample {

	public static void main(String[] args) {
		ArrayDeque dq = new ArrayDeque();
		dq.addFirst(2);
		dq.addLast(100);
		dq.add(5);
		dq.addFirst(105);
		dq.add(10);
		dq.addFirst(4);
		System.out.println("original queue: " +dq);
		dq.removeLast();
		System.out.println("After removing last element "+dq);
		System.out.println("checks the specific contain element or not? "+dq.contains(100));
        System.out.println("First element in list " +dq.getFirst());
        System.out.println("Last element in list " +dq.getLast());
        System.out.println(dq);
        dq.push(22);
        dq.push(30);
        System.out.println("push adds the elements at the first "+dq);
        System.out.println("pop removes the top element "+dq.pop());
        
	}

}
