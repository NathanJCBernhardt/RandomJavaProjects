package javaapplication14;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author p0073862
 */
public class GeneralUtilities {

    /**
     * Perform a depth first traversal of a graph, printing out the name of each
     * node visited
     *
     * @param g Graph to be traversed
     * @param startName Name of the first person to be printed out
     */
    public static void depthFirstTraversal(FriendsGraph g, String startName) {
        Set<Integer> visited = new HashSet<>();
        int startIndex = g.getNodeIndex(startName);
        if (startIndex >= 0) {
            dft(g, startIndex, visited);
        } else {
            System.out.println("Node " + startName + " not found");
        }

    }

    /**
     * Returns a list of mutual friends of two people in a graph
     *
     * @param g The graph
     * @param person1 Name of first person
     * @param person2 Name of second person
     * @return a list of names of the mutual friends of the two people, empty if
     * one person is not in the graph or they have no mutual friends
     *
     */
    public static List<String> mutualFriends(FriendsGraph g, String person1, String person2) {
        List<String> result = new LinkedList<>();
        int index1 = g.getNodeIndex(person1);
        int index2 = g.getNodeIndex(person2);
        if (index1 >= 0 && index2 >= 0) {
            List<Integer> friends1 = g.getAdjacentNodes(index1);
            List<Integer> friends2 = g.getAdjacentNodes(index2);

            for (Integer i : friends1) {
                if (friends2.contains(i)) {
                    result.add(g.getNode(i).getName());
                }
            }
        }
        return result;
    }

    private static void dft(FriendsGraph g, int i, Set<Integer> visited) {
        System.out.println(g.getNode(i).getName());
        visited.add(i);
        for (int j : g.getAdjacentNodes(i)) {
            if (!visited.contains(j)) {
                dft(g, j, visited);
            }
        }
    }

}
