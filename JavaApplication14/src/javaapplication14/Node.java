package javaapplication14;
import java.util.*;

/** A simple container class representing a node of a friendship graph.
  */
public class Node {

/** The name at this node. */
    private final String name;

/** The x-coordinate of this node, for display purposes. */
    private final float x;

/** The y-coordinate of this node, for display purposes. */
    private final float y;

/** Constructs a node with the given name, to be displayed at
  * the given position.
     * @param name Name of this Node
     * @param x x co-ordinate at which to display this Node
     * @param y y co-ordinate at which to display this Node
  */
    public Node(String name, int x, int y) {
        this.name = name;
        this.x = (float)x;
        this.y = (float)y;
     }

    public String getName() {
        return name;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }


}