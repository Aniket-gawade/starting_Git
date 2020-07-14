package LinkList;

public class MainLL {

	public static void main(String[] args) {
		
		MyLL ll = new MyLL();
		
		for(int i=0; i<10; i++) {
			ll.add(i);
		}
		ll.get(7);
		ll.set(7, 10);
		ll.print();
	}

}
