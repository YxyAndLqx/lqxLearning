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
            //先遍历根节点，从根一直到最左的叶子节点
            if (point.getSubLeft() != null && !binaryTreeList.contains(point.getData())){
                System.out.print(point.getData());
                binaryTreeList.add(point.getData());
                point = point.getSubLeft();
                continue;
            }
            //左子树的最左叶子节点。如果左叶子为空，则回到父节点。
            if (point.getSubLeft() == null && !binaryTreeList.contains(point.getData())){
                System.out.print(point.getData());
                binaryTreeList.add(point.getData());
                point = point.getParent();
                continue;
            }
            //查看父节点的有无叶子节点。
            if (point.getSubRight() != null && !binaryTreeList.contains(point.getSubRight().getData())){
                point = point.getSubRight();
                continue;
            }else if(point.getParent() != null){
                //左右都已经遍历，则返回父节点
                point = point.getParent();
                continue;
            }else {
                //若根节点和左右节点都已经访问，则break
                break;
            }
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
    //非递归版根中序遍历
    public static void inOrder(BinaryTree rootNode){
        BinaryTree point =  rootNode;
        List<String> binaryInTreeList = new ArrayList<>();
        while (true){
            //先到二叉树，最左的叶子节点。
            if (point.getSubLeft() != null && !binaryInTreeList.contains(point.getSubLeft().getData())){
                point = point.getSubLeft();
                continue;
            }
            //查看节点有没有右子节点，得到节点的值，返回父节点
            if (point.getSubRight() == null && !binaryInTreeList.contains(point.getData())){
                System.out.print(point.getData());
                binaryInTreeList.add(point.getData());
                point = point.getParent();
                continue;
            }
            //到这一步，说明上一步的父节点有右子节点，得到父节点的值，走向右子节点。
            if (point.getSubRight() != null && !binaryInTreeList.contains(point.getSubRight().getData())){
                System.out.print(point.getData());
                binaryInTreeList.add(point.getData());
                point = point.getSubRight();
                continue;
            }else if(point.getParent() != null){
                //右子节点，没有左子节点，返回父节点
                point = point.getParent();
                continue;
            }else {
                //若根节点和左右节点都已经访问，则break
                break;
            }
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
    //非递归版根后序遍历
    public static void postOrder(BinaryTree rootNode){
        BinaryTree point =  rootNode;
        List<String> binaryInTreeList = new ArrayList<>();
        while (true) {
            //先到二叉树，最左的叶子节点。
            if (point.getSubLeft() != null && !binaryInTreeList.contains(point.getSubLeft().getData())) {
                point = point.getSubLeft();
                continue;
            }
            //查看节点有没有右子节点，得到节点的值，返回父节点
            if (point.getSubRight() == null && !binaryInTreeList.contains(point.getData())){
                System.out.print(point.getData());
                binaryInTreeList.add(point.getData());
                point = point.getParent();
                continue;
            }
            //到这一步，说明上一步的父节点有右子节点，走向右子节点。
            if (point.getSubRight() != null && !binaryInTreeList.contains(point.getSubRight().getData())){
                point = point.getSubRight();
                continue;
            }else if(point.getParent() == null){
                //回到root根节点
                System.out.print(point.getData());
                binaryInTreeList.add(point.getData());
                break;
            }else {
                //若根节点和左右节点都已经访问，则break
                System.out.print(point.getData());
                binaryInTreeList.add(point.getData());
                point = point.getParent();
            }
        }
    }

}
