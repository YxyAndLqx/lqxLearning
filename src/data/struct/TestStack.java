package data.struct;

/**
 * @author: LiJie
 * @Date: 2020/2/19 23:53
 */
public class TestStack {


    public static void main(String[] args) {
        //初始化
        Stack stack = new Stack();
        System.out.println(stack.getLength());
        System.out.println(stack.getTop());
        stack.push(9);
        stack.push(8);
        stack.push(7);
        stack.push(12);
        stack.push(6);
        //测试压栈
        System.out.println(stack.getLength());
        System.out.println(stack.getTop());
        //测试出栈
        System.out.println(stack.pop());
        System.out.println(stack.getLength());
        System.out.println(stack.getTop());
    }
}
