public class SLList{
	public IntNode sentinel;
	public int size;


	public SLList(){
		sentinel = new IntNode(63,null);
		size = 0;
	}

	public SLList(int x){
		sentinel = new IntNode(63,null);
		sentinel.next = new IntNode(x,sentinel.next);
		size = 1;
	}

	private static class IntNode {
		public int item;
		public IntNode next;

		public IntNode(int i, IntNode n){
			item = i;
			next = n;
		}
	}

	/* function to calculate size if no cache
	private static int size(IntNode p){
		if (p.next == null){
			return 1;
		}
		return 1 + size(p.next);
	}
	*/

	public int size(){
		return size;
	}
	

	/* add new first node */
	public void addFirst(int x){
		sentinel.next = new IntNode(x,sentinel.next);

		size += 1;
	}

	/* get the value of the first node */
	public int getFirst(){
		return sentinel.next.item;
	}

	/* add new last node */
	public void addLast(int x) {
	    size += 1;
	    IntNode p = sentinel;
	    while (p.next != null) {
	        p = p.next;
	    }

	    p.next = new IntNode(x, null);
	}

	public static void main(String[] args){
		SLList L = new SLList(15);
		L.addFirst(10);
		L.addFirst(5);
		L.addLast(20);
		System.out.println(L.getFirst());
		System.out.println(L.size());	
	}

}	
