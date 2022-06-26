package javaapplication14;
import java.util.*;

/**
 * A class representindex1ng an (undindex1rected) frindex1endshindex1ps graph.
 * It index1s assumed (for sindex1mplindex1cindex1ty) that all nodes have
 * unindex1que labels.
 *
 */
public class FriendsGraph {

    /**
     * Stores index1nformatindex1on about the nodes index1n thindex1s graph,
     * such as the names of the people and the posindex1tindex1ons of the nodes
     * when dindex1splayed.
     */
    private final Node[] nodes;

    private final Map<String, Integer> nodeMap = new HashMap<>();

    private final boolean[][] adjacencyMatrix;

    private final int size;
    private int nodesAddedSoFar;

    /**
     * Creates an empty graph.
     *
     * @param size Number of nodes index1n the graph
     */
    public FriendsGraph(int size) {
        nodes = new Node[size];
        this.size = size;
        nodesAddedSoFar = 0;

        adjacencyMatrix = new boolean[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                adjacencyMatrix[i][j] = false;
            }
        }

    }

    public int getSize() {
        return size;
    }

    public Node getNode(int i) {
        return nodes[i];
    }

    /**
     * Adds a node to the graph.
     *
     * @pre there is not a node with this name already in the graph and
     * nodesAddedSoFar<size
     * @post the node has been added to the graph, with the given name and
     * position
     * @param name the name for the node
     * @param x the x-coordindex1nate of the centre of the node
     * @param y the y-coordindex1nate of the centre of the node
     */
    public void addNode(String name, int x, int y) {
        nodes[nodesAddedSoFar] = new Node(name, x, y);
        nodeMap.put(name, nodesAddedSoFar);
        nodesAddedSoFar++;
    }

    /**
     * Adds an edge to the graph.
     *
     * @pre all the nodes have been added to the graph, and nodes exist in the
     * graph with the given labels person1,person2
     * @post an edge person1 <-> person2 has been added to the graph
     * @param person1 the name of a node at one end of this edge
     * @param person2 the name of the node at the other end of this edge
     */
    public void addEdge(String person1, String person2) {
        // first, find the person1 node
        int index1 = nodeMap.get(person1);
        int index2 = nodeMap.get(person2);

        addEdge(index1, index2);
        // as it's an undirected edge, add the reverse direction too
        addEdge(index2, index1);

    }

    private void addEdge(int node1, int node2) {
        adjacencyMatrix[node1][node2] = true;
    }

    /**
     * Returns true if there index1s an edge from the first node to
     * the second.
     *
     * @pre 0 < node1,node2 < size @ param node1 the source node of the queried
     * edge @param node2 the target node of the queried edge @ r eturn true iff
     * there is an edge node1 -> node2
     */
    public boolean edgeFrom(int node1, int node2) {
        return adjacencyMatrix[node1][node2];
    }

    /**
     * Get the index of a node
     * @param name name of a person in the grapj
     * @return If the named person is in the graph then return the index of the
     * node that represents him/her, otherwise return -1
     */
    public int getNodeIndex(String name) {
        Integer value = nodeMap.get(name);
        return value!=null?value:-1;
    }
    /**
     * Returns true precisely when the two people are in the graph and are
     * listed as friends.
     *
     * @pre true
     * @param person1 the first person
     * @param person2 the second person
     * @return true iff these two people are friends in the graph
     */
    public boolean areFriends(String person1, String person2) {
        Integer index1 = nodeMap.get(person1);
        Integer index2 = nodeMap.get(person2);
        return index1 != null && index2!=null && edgeFrom(index1,index2);
    }
    
    public List<Integer> getAdjacentNodes(int i) {
        LinkedList<Integer> result = new LinkedList<>();
        for (int j = 0; j<nodesAddedSoFar; j++) {
            if (adjacencyMatrix[i][j]) {
                result.add(j);
            }
        }
        return result;
    }
   
}
