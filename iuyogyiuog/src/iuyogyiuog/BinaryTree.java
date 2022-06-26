package iuyogyiuog;
/**
 * Represents a simple binary tree of integers.
 *
 */
public class BinaryTree {

    /**
     * The integer stored at this tree node.
     */
    public int data;

    /**
     * A reference to this node's left subtree.
     */
    public BinaryTree left;

    /**
     * A reference to this node's right subtree.
     */
    public BinaryTree right;

    /**
     * Constructs a binary tree with a single node, using the given value. Note
     * that there is no constructor to construct an empty tree; an empty tree is
     * just represented by a null pointer.
     *
     * @param val the integer value to be placed at the root node of this tree
     */
    public BinaryTree(int val) {
        data = val;
        left = null;
        right = null;
    }

    /*N.B. You don't need to worry about any of the remaining attributes. They are
     there solely to help display the tree.
     */
    public int x, y;     // display position of this tree node

    public int boxWidth;      // used for calculating x,y coordinates
    public int nodeFromLeft;  // used for calculating x,y coordinates

    public int xdfp;          // x-distance of this node from parent node
    public int height;        // to calculate the height/depth of the tree

}
