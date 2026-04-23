package entities;

public class LinkedList<T> {
	
	private Node<T> head;
	
	public void addFirst(T value) {
		
		Node<T> new_node  = new Node<>(value);
		
		new_node.setNext(head);
		head = new_node;
	}
	
	public void addLast(T value) {
	
		Node<T> new_node = new Node<>(value);
		
		if (head == null) {
            head = new_node;
            return;
        }
		
		Node<T> aux = head;
		while(aux.getNext() != null) {
			aux = aux.getNext();
		}
		
		aux.setNext(new_node);
	}
	
	public void printList() {
		
		if (head == null) {
	        System.out.println("{}");
	        return;
	    }
		
		Node<T> aux = head;
		System.out.print("{ ");
		while(aux != null) {
			System.out.print(aux.getValue() + " ");
			aux = aux.getNext();
		}
		System.out.print("}");
		System.out.println();
	}
}
