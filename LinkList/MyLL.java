package LinkList;

public class MyLL {
	
	Node head;
	
	void add(int data) {
		Node toAdd = new Node(data);
		if(head==null) {
		head = toAdd;
		return;
		}
		
		Node t=head;
		while(t.next != null) {
			t = t.next;
		}
		t.next = toAdd;
	}
	
	void print() {
		Node t=head;
		while(t != null) {
			System.out.print(t.data +" ");
			t =t.next;
		}
	}
	
	void get(int i) {
		Node t=head;
		int x=0;
		while(t != null) {
			if(x==i) {
				System.out.println(t.data);
				return;
			}else {
			t=t.next;
			x++;
			}
		}
	}
	
	void set(int i,int j) {
		Node t=head;
		int x=0;
		while(t != null) {
			if(x==i) {
				t.data=j;
				return;
			}else {
			t=t.next;
			x++;
			}
		}
	}
	

	static class Node{
		
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			next = null;
		}
	}
}
