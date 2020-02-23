package data.struct.tree;

/**
 * @author: LiJie
 * @Date: 2020/2/23 22:50
 */
public class TreeTraverse {
    /**
     * 递归版二叉树遍历
     * @param rootNode 根节点
     */

    //递归版根先序遍历
    public static void preOrder(BinaryTree rootNode){
        if (rootNode != null){
            System.out.print(rootNode.getData());
            preOrder(rootNode.getSubLeft());
            preOrder(rootNode.getSubRight());
        }
    }
    //递归版根中序遍历
    public static void inOrder(BinaryTree rootNode){
        if (rootNode != null){
            inOrder(rootNode.getSubLeft());
            System.out.print(rootNode.getData());
            inOrder(rootNode.getSubRight());
        }
    }
    //递归版根后序遍历
    public static void postOrder(BinaryTree rootNode){
        if (rootNode != null){
            postOrder(rootNode.getSubLeft());
            postOrder(rootNode.getSubRight());
            System.out.print(rootNode.getData());
        }
    }
}
