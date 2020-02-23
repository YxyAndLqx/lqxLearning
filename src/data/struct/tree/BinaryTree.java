package data.struct.tree;

/**
 * @author: LiJie
 * @Date: 2020/2/23 21:53
 */
public class BinaryTree {
    private BinaryTree parent;
    private BinaryTree subRight;
    private BinaryTree subLeft;
    private String data;


    public BinaryTree(String data){
        this.data =data;
    }

    public BinaryTree getParent() {
        return parent;
    }

    public void setParent(BinaryTree parent) {
        this.parent = parent;
    }

    public BinaryTree getSubRight() {
        return subRight;
    }

    public void setSubRight(BinaryTree subRight) {
        this.subRight = subRight;
    }

    public BinaryTree getSubLeft() {
        return subLeft;
    }

    public void setSubLeft(BinaryTree subLeft) {
        this.subLeft = subLeft;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{" +
                " data='" + data + '\'' +
                ", subLeft=" + subLeft +
                ", subRight=" + subRight +
                '}';
    }
}
