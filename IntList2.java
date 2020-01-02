public class IntList2{
	public int first;
	public IntList2 rest;

	public IntList2(int f, IntList2 r){
		first = f;
		rest = r;
	}

	/* calculate size recursively */
	public int size(){
		if (this.rest == null){
			return 1;
		}
		return 1 + this.rest.size();
	}

	/* calculate size iteratively */
	public int interativeSize(){
		IntList2 p = this;
		int totalSize = 0;
		while(p != null){
			totalSize += 1;
			p = p.rest;
		}
		return totalSize;
	}

	/* get(i): return ith item in the list */
	/* recursive */
	public int get(int i){
		if (i == 0){
			return first;
		}
		return rest.get(i-1);
	}


	/* iterative */
	public int getIterative(int i){
		int v = this.first;
		IntList2 p = this;
		if (i == 0){
			return p.first;
		}
		while (i >0){
			i -= 1;
			p = p.rest;
			v = p.first;
		}
		return v;
	}

	public static void main(String[] args){
		IntList2 L = new IntList2(15,null);
		L = new IntList2(10,L);
		L = new IntList2(5,L);

		System.out.println(L.size());
		System.out.println(L.interativeSize());
		System.out.println(L.get(2));
		System.out.println(L.getIterative(2));
	}

}