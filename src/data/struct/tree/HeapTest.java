package data.struct.tree;

/**
 * @author: LiJie
 * @Date: 2020/2/27 22:52
 */
public class HeapTest {
    public static void main(String [] args){
        Heap heap = new Heap();
        heap.initHeap();
        heap.insertHeap(18);
        heap.insertHeap(20);
        heap.insertHeap(22);
        heap.insertHeap(5);
        heap.insertHeap(6);
        heap.insertHeap(40);
        heap.insertHeap(68);

//        heap.InsertHeap(23);
        System.out.println(heap.toString());
        // 删除
        heap.deleteHeapMaxUseInsert();
        System.out.println(heap.toString());
        // 插入
        heap.insertHeap(68);
        System.out.println(heap.toString());
        //删除
        heap.deleteHeapMaxNotInsert();
        System.out.println(heap.toString());
    }
}
