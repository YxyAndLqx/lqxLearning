package data.struct.tree;

/**
 * @author: LiJie
 * @Date: 2020/2/23 22:10
 */
public class BinaryTest {
    public static void main(String [] args){

        /**
         *                     A
         *                   ↙   ↘
         *                 B          C
         *               ↙  ↘     ↙  ↘
         *              D       E   F     G
         *           ↙ ↘    ↙
         *           H    I  J
         */

        BinaryTree nodeA = new BinaryTree("A");
        BinaryTree nodeB = new BinaryTree("B");
        BinaryTree nodeC = new BinaryTree("C");
        BinaryTree nodeD = new BinaryTree("D");
        BinaryTree nodeE = new BinaryTree("E");
        BinaryTree nodeF = new BinaryTree("F");
        BinaryTree nodeG = new BinaryTree("G");
        BinaryTree nodeH = new BinaryTree("H");
        BinaryTree nodeI = new BinaryTree("I");
        BinaryTree nodeJ = new BinaryTree("J");

        nodeA.setSubLeft(nodeB);
        nodeA.setSubRight(nodeC);

        nodeB.setParent(nodeA);
        nodeB.setSubLeft(nodeD);
        nodeB.setSubRight(nodeE);

        nodeC.setParent(nodeA);
        nodeC.setSubLeft(nodeF);
        nodeC.setSubRight(nodeG);

        nodeD.setParent(nodeB);
        nodeD.setSubLeft(nodeH);
        nodeD.setSubRight(nodeI);

        nodeE.setParent(nodeB);
        nodeE.setSubLeft(nodeJ);

        nodeF.setParent(nodeC);

        nodeG.setParent(nodeC);

        nodeH.setParent(nodeD);

        nodeI.setParent(nodeD);

        nodeJ.setParent(nodeE);


//        System.out.println(nodeA.toString());

        /**
         * 递归版二叉树遍历
         *                     A
         *                   ↙   ↘
         *                 B          C
         *               ↙  ↘     ↙  ↘
         *              D       E   F     G
         *           ↙ ↘    ↙
         *           H    I  J
         */
        System.out.println("根先序遍历：");
        TreeTraverse.preOrder(nodeA);
        System.out.println();
        System.out.println("根中序遍历：");
        TreeTraverse.inOrder(nodeA);
        System.out.println();
        System.out.println("根后序遍历：");
        TreeTraverse.postOrder(nodeA);

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
    }
}
