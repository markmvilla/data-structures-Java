/*
Data Structures

Author		Mark Villa
Date		  May 4, 2018
Website		http://www.markvilla.org
Copyright	2018 Mark Villa.
*/

//package markvilla.cs.datastructures;

class SimpleLinkedList {
	
	public Node head = new Node(null);

    public SimpleLinkedList() {
        head = new Node(null);
    }
    
	class Node{
		public Object element;
		public Node next;
		public Node(Object element) {
			this.element = element;
			this.next = null;
		}
	}	

    public void addTail(Object element) {
    	Node newNode = new Node(element);
		Node currentNode = head;
    	while (currentNode.next != null) {
    		currentNode = currentNode.next;
		}
    	currentNode.next = newNode;
    }

    public void removeTail() {
		Node currentNode = head;
    	while (currentNode.next.next != null) {
    		currentNode = currentNode.next;
		}
    	currentNode.next = null;
    }
}
