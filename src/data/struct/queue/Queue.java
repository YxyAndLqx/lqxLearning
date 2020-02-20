package data.struct.queue;

import java.util.Arrays;

/**
 * @author: LiJie
 * @Date: 2020/2/21 1:55
 */
public class Queue {
    private int length;
    private int [] arr = new int[]{};

    public int getLength() {
        return length;
    }

    private void setArr(int[] arr) {
        this.arr = arr;
    }
    //添加队列元素
    public void addQueue(int element){
        int [] tempArr = new int[length + 1];
        System.arraycopy(arr, 0, tempArr,0, length);
        tempArr[length] = element;
        setArr(tempArr);
        length++;
    }
    //出队列
    public int removeQueue(){
        //队列为空
        if (length < 1){
            return -1;
        }
        int queueHead = arr[0];
        int [] tempArr = new int[length - 1];
        System.arraycopy(arr, 1, tempArr,0, length -1);
        setArr(tempArr);
        length--;
        return queueHead;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "length=" + length +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }
}
