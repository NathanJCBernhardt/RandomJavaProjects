package iuyogyiuog;
import javax.swing.*;
import java.awt.image.*;
import java.util.*;

public class TreePlay {

    public static void main(String[] args) {

        // creates a binary tree with some random numbers in it
        BinaryTree t = TreeUtilities.createRandomTree();

        System.out.println("PREORDER TRAVERSAL");
        TreeNavigator.preOrderTraversal(t);

        System.out.println("POSTORDER TRAVERSAL");
        TreeNavigator.postOrderTraversal(t);

        System.out.println("INORDER TRAVERSAL");
        TreeNavigator.inOrderTraversal(t);

        System.out.println("LEAF COUNT = " + TreeNavigator.leafCount(t));
        
        System.out.println("DEPTH = " + TreeNavigator.depth(t));

        // shows a pop-up window displaying tree t
        TreeUtilities.showTree(t);

        // keep the following line as the last line of the main method
        System.exit(0); // <- exits the program immediately
        // (the above line is handy if there's an invisible pop-up window
        // still hanging about preventing the program from terminating)

    }
}
