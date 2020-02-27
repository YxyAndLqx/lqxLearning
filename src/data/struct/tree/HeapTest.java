package data.struct.tree;

/**
 * @author: LiJie
 * @Date: 2020/2/27 22:52
 */
public class HeapTest {
    public static void main(String [] args){
        Heap heap = new Heap();
        heap.MaxHeap();
        heap.InsertHeap(18);
        heap.InsertHeap(20);
//        heap.InsertHeap(23);
        System.out.print(heap.toString());
    }
}
