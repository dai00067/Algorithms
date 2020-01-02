public class SLList{
	public IntNode first;

	public SLList(int x){
		first = new IntNode(x,null);
	}

	public class IntNode {
		public int item;
		public IntNode next;

		public IntNode(int i, IntNode n){
			item = i;
			next = n;
		}
	}

	/* add new first node */
	public void addFirst(int x){
		first = new IntNode(x,first);
	}

	/* get the value of the first node */
	public int getFirst(){
		return first.item;
	}

	public static void main(String[] args){
		SLList L = new SLList(15);
		L.addFirst(10);
		L.addFirst(5);
		System.out.println(L.getFirst());
	}

}	
