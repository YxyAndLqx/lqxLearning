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
        return !(this.count > 0);
    }
    //判断堆满
    public boolean HeapFulls(){
        return (this.count == MaxSize-1);
    }

    /**
     *       这种完全二叉树，左右节点为 2i+1 和 2i+2
     *
     *
     *                     0A
     *                   ↙   ↘
     *                 1B         2C
     *               ↙  ↘     ↙  ↘
     *             3D      4E  5F     6G
     *           ↙ ↘    ↙
     *          7H   8I  9J
     *
     *
     */


    /**
     *          建议用这种构造 count = 数组下标。 父节点 = i/2
     *               这种完全二叉树，左右节点为 2i 和 2i+1
     *
     *                            1A
     *                          ↙   ↘
     *                       2B         3C
     *                     ↙  ↘     ↙  ↘
     *                   4D      5E  6F     7G
     *                 ↙ ↘    ↙
     *                8H   9I  10J
     *
     */



    //堆中插入值    舍去数组0，直接从1开始，左右子节点为 2i 和 2i+1
    public void insertHeap(int element){
        int i = 0;
        if (!this.HeapFulls()){
            i = this.count + 1;
            while ((i !=1) && (element > this.heapElementTypeArray[i/2])){
                this.heapElementTypeArray[i] = this.heapElementTypeArray[i/2];
                i /= 2;
            }
        }
        this.heapElementTypeArray[i] = element;
        this.count++;
    }

    /**
     * 复制堆，去掉根，然后插入。
     */
    //堆中删除最大值    舍去数组0，直接从1开始，左右子节点为 2i 和 2i+1
    public void  deleteHeapMax(){
        if (!this.HeapEmpty()){
            int i = this.count - 1;
            int [] tempArray = new int[i];
            for (int j = 0; j< i; j++){
                tempArray[j] = this.heapElementTypeArray[j+2];
            }
            int [] heapClearArray = new int[MaxSize];
            System.arraycopy(heapClearArray,0, this.heapElementTypeArray,0, MaxSize);
            this.MaxHeap();
            for (int k = 0; k < i; k++){
                this.insertHeap(tempArray[k]);
            }
        }
    }

    @Override
    public String toString() {
        return "Heap{" +
                "count=" + count +
                ", heapElementTypeArray=" + Arrays.toString(heapElementTypeArray) +
                '}';
    }
}
