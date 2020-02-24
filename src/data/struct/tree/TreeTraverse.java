package data.struct.tree;

import java.util.ArrayList;
import java.util.List;

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
    public static void preOrderRecursion(BinaryTree rootNode){
        if (rootNode != null){
            System.out.print(rootNode.getData());
            preOrderRecursion(rootNode.getSubLeft());
            preOrderRecursion(rootNode.getSubRight());
        }
    }
    //递归版根中序遍历
    public static void inOrderRecursion(BinaryTree rootNode){
        if (rootNode != null){
            inOrderRecursion(rootNode.getSubLeft());
            System.out.print(rootNode.getData());
            inOrderRecursion(rootNode.getSubRight());
        }
    }
    //递归版根后序遍历
    public static void postOrderRecursion(BinaryTree rootNode){
        if (rootNode != null){
            postOrderRecursion(rootNode.getSubLeft());
            postOrderRecursion(rootNode.getSubRight());
            System.out.print(rootNode.getData());
        }
    }

    /**
     * 非递归版二叉树遍历
     *                     A
     *                   ↙   ↘
     *                 B          C
     *               ↙  ↘     ↙  ↘
     *              D       E   F     G
     *           ↙ ↘    ↙
     *           H    I  J
     */
    /**
     * 非递归版二叉树遍历
     * @param rootNode 根节点
     */
    //非递归版根先序遍历
    public static void preOrder(BinaryTree rootNode){
        BinaryTree point =  rootNode;
        List<String> binaryTreeList = new ArrayList<>();
        while (true){
            if (point.getSubLeft() != null && !binaryTreeList.contains(point.getData())){
                System.out.print(point.getData());
                binaryTreeList.add(point.getData());
                point = point.getSubLeft();
                continue;
            }
            if (point.getSubLeft() == null && !binaryTreeList.contains(point.getData())){
                System.out.print(point.getData());
                binaryTreeList.add(point.getData());
                point = point.getParent();
                continue;
            }
            if (point.getSubRight() != null && !binaryTreeList.contains(point.getSubRight().getData())){
                point = point.getSubRight();
                System.out.print(point.getData());
                binaryTreeList.add(point.getData());
                continue;
            }else if(point.getParent() != null){
                point = point.getParent();
                continue;
            }else {
                break;
            }
        }




    }

    //非递归版根先序遍历
    public static void inOrder(BinaryTree rootNode){

    }

    //非递归版根先序遍历
    public static void postOrder(BinaryTree rootNode){

    }

}
