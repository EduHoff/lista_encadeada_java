package entities;

public class LinkedList<T> {
	
	private Node<T> head;
	private Node<T> tail;
	private int size=0;
	
	public void addFirst(T value) {
		Node<T> new_node  = new Node<>(value);
		
		new_node.setNext(head);
		if(head == null){
			tail = new_node;
		}
		head = new_node;
		size++;
	}
	
	public void addLast(T value) {
		Node<T> new_node = new Node<>(value);
		
		if (head == null) {
            head = new_node;
			tail = new_node;
			size++;
            return;
        }
		
		tail.setNext(new_node);
		tail = new_node;
		size++;
	}

	public void addMiddle(int index, T value) {
		if(index < 0 || index > size) throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		
		if(index == 0) {
			addFirst(value);
			return;
		}

		if(index == size){
			addLast(value);
			return;
		}

		Node<T> new_node = new Node<>(value);
		
		Node<T> aux = head;
		int count = 0;
		while(count != index-1) {
			aux = aux.getNext();
			count++;
		}

		new_node.setNext(aux.getNext());
		aux.setNext(new_node);
		size++;
	}
	
	public void printList() {
		
		if (head == null) {
	        System.out.println("{}");
	        return;
	    }
		
		Node<T> aux = head;
		while(aux != null) {
			System.out.print(aux.getValue());
			if(aux.getNext() != null) System.out.print(" -> ");
			aux = aux.getNext();
		}
		System.out.println();
	}

	public int length() {
		return size;
	}
}
