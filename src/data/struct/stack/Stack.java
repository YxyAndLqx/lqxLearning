package data.struct.stack;

import java.util.Arrays;

/**
 * @author: LiJie
 * @Date: 2020/2/19 22:31
 */
public class Stack{

    private int length;
    private int [] arr = new int[]{};

    private void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getLength() {
        return length;
    }

    //压栈
    public void push(int element){
        int [] tempArr = new int[length + 1];
        System.arraycopy(arr,0, tempArr, 0, length);
        tempArr[length] = element;
        setArr(tempArr);
        length++;
    }
    //弹栈
    public int pop(){
        //栈空
        if (length < 1){
            return -1;
        }
        int top = arr[length - 1];
        int [] tempArr = new int[length - 1];
        System.arraycopy(arr,0, tempArr, 0, length -1);
        setArr(tempArr);
        length--;
        return top;
    }
    //获取栈顶元素
    public int getTop(){
        //栈空
        if (length < 1){
            return -1;
        }
        return arr[length -1];
    }

    @Override
    public String toString() {
        return "Stack{" +
                "length=" + length +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }
}
