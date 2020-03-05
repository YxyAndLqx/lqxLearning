package data.struct.tree;

/**
 * @author: LiJie
 * @Date: 2020/2/27 22:52
 */
public class HeapTest {
    public static void main(String [] args){
        Heap heap = new Heap();
        heap.MaxHeap();
        heap.insertHeap(18);
        heap.insertHeap(20);
        heap.insertHeap(22);
        heap.insertHeap(5);
        heap.insertHeap(6);
        heap.insertHeap(40);
        heap.insertHeap(68);

//        heap.InsertHeap(23);
        System.out.println(heap.toString());

        heap.deleteHeapMax();
        System.out.println(heap.toString());
    }
}
