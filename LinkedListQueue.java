
public class LinkedListQueue implements Queue {

	Node head = new Node();
	private int size;

	public static class Node {
		 int data;
		Node next = this;
		Node prev = this;

		Node( int data) {
			this.data = data;
		}


		public Node() {
		
		}

		Node( int data, Node next, Node prev) {
			this.data = data;
			this.next = next;
			this.prev = prev;
		}
	}

	public void search( int d) {
		Node s = head.next;

		boolean find = false;
		for (Node i = s; i != head; i = i.next) {
			if (d == i.data) {
				find = true;
				break;
			}
		}
		if (find) {
			System.out.print("element is find ");
		} else {
			System.out.print("element is find ");

		}
	}
//problem
	public int removelast(){
		Node n=null;
		if (head.next == null) {
			throw new IllegalArgumentException("Stack is Empty");
		} 
		else{
			n=head.prev;
head=head.prev;
			--size;
		}
		return n.data;
	}


public  void merge(Node head1, Node head2){
	head1.prev.next = head2.next;
	head2.next.prev = head1.prev;
	head2.prev.next = head1;
	head1.prev = head2.prev;
}


public Object clone(){
	Node a=head;
	for (Node p = head.next; p != head; p = p.next) {
		a.data=p.data;
	}
	for ( a = head.next; a != head.prev; a = a.next) {
		System.out.print(a.data+",");
	}

return a.data;

}


//problem
public boolean equals(Node a,Node b){
	boolean flag=false;
	for(Node i=head.next;i!=head;i=i.next)
{
	
if(a.data==b.data){
flag=true;

}
else{
	flag=false;
	break;
}
}
if(flag){
return true;
}
else{
	return false;
}
}

	public static void main(String[] args) {
		

		LinkedListQueue llq = new LinkedListQueue();
		llq.add(1);
		llq.add(2);

llq.add(4);
		llq.add(5);
		llq.add(6);
		llq.add(7);
System.out.println(llq.clone());

		System.out.println("reverse :");
		llq.reverse();
		System.out.println("display :");
		llq.display();
	System.out.println("remove First"+llq.remove());
		System.out.println();
		llq.display();
	System.out.println("remove  Last :"+llq.removelast());
		 	System.out.println();
		 llq.display();
		// llq.add(3);
		// llq.add(4);
		// llq.add(5);
		// llq.add(6);

		LinkedListQueue llq2 = new LinkedListQueue();
		llq2.add(88);
		llq2.add(99);
		
		
		System.out.println("display 2nd link list:");
		llq2.display();
		
		
		System.out.println();
System.out.println("equal method"+llq.equals(llq.head,llq2.head));

System.out.println();
System.out.println("merging both list");
		llq.merge(llq.head, llq2.head);
llq.display();
System.out.println();

	

	// 	System.out.println("display: ");	llq.display();
	// 	System.out.println("size of queue "+llq.size());
	// 	System.out.println();
	
		llq.middle(500);
		 System.out.println();
		 System.out.println("After insert  middle display:");
		System.out.println();
		llq.display();
		System.out.println();
		llq.search(4);

		System.out.println();//		System.out.println("size of queue "+llq.size());
//		System.out.println("first element queue is "+llq.first());

		// System.out.println("After removing");
		// llq.display();
		// System.out.println(llq.size());
//		System.out.println(llq.toString());

	}



	public void middle( int obj) {
		Node a = head.next;
		Node b = head.next;
		while (b != head.prev && b.next != head.prev) {
			b = b.next.next;
			a = a.next;
		}
	//	System.out.println("the middle element is " + a.data);
a=a.next;
		a.prev= a.prev.next = new Node(obj, a, a.prev);
		++size;
	}


	public void reverse() {
		for (Node p = head.prev; p != head; p = p.prev) {
			System.out.print(p.data+" , ");

		}
	}
	
	public void display() {
		for (Node p = head.next; p != head; p = p.next) {
			System.out.print(p.data+",");
		}
	}

	// head.next=first element
	// head.prev=last element

	public void add( int obj) {
	
		// Node i=head;
		if (this.head.next == null) {
			head.next.data = obj;
			head.prev = head.next;
			++size;
		} else {
			head.prev = head.prev.next = new Node(obj, head, head.prev);
			++size;
			
		}
	}


	public  int first() {
	
		if (head.next == null)
			throw new IllegalArgumentException("Stack is Empty.");
		return head.next.data;
	}

	
	public  int remove() {
		
		Node n = null;
		if (head.next == null) {
			throw new IllegalArgumentException("Stack is Empty");
		} else {
			n = head.next;
			head.next = head.next.next;
			size--;
		}
		return n.data;
	}

	public String toString() {
		String result ="the";
		Node n = head.next;
		while (n != null) {
			result += n.data+",";
			n = n.next;
		}
		return result;
	}



	public int size() {
		
		return size;
	}

}