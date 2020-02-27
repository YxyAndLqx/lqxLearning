package data.struct.tree;

import java.util.Arrays;

/**
 * @author: LiJie
 * @Date: 2020/2/27 0:10
 */
public class Heap {
    //最大堆容量
    private static final int MaxSize = 200;
    //计数器
    private int count;
    private int [] heapElementTypeArray = new int[MaxSize];
    //初始化堆，堆的计数器清零
    public void MaxHeap(){
        this.count = 0;
    }
    //判断堆是否为空
    public boolean HeapEmpty(){
        return (this.count > 0);
    }
    //判断堆满
    public boolean HeapFulls(){
        return (this.count == MaxSize-1);
    }

    //堆中插入值
    public void InsertHeap(int element){
        int i = 0;
        if (!this.HeapEmpty()){
            i = this.count + 1;
            while ((i !=1) && (element > this.heapElementTypeArray[i/2])){
                this.heapElementTypeArray[i] = this.heapElementTypeArray[i/2];
                i /= 2;
            }
        }
        this.heapElementTypeArray[i] = element;
    }

    @Override
    public String toString() {
        return "Heap{" +
                "count=" + count +
                ", heapElementTypeArray=" + Arrays.toString(heapElementTypeArray) +
                '}';
    }
}
