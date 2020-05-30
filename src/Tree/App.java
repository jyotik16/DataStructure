package Tree;

public class App {
	public static void main(String[] args) {
		
		Heap heap = new Heap(10);
		
		heap.insert(10);
		heap.insert(100);
		heap.insert(50);
//		heap.insert(80);
//		heap.insert(40);
//		heap.insert(20);
//		
//		//heap.heapsort();
//		heap.displayHeap();
		heap.remove();
		heap.displayHeap();
		heap.remove();
		heap.displayHeap();
		
		heap.displayHeap();
		
	}
}
