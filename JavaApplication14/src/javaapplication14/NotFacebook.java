package javaapplication14;
import java.io.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * A program for playing with graphs representing networks of friends.
 */
public class NotFacebook {

    // Change this startFolder variable to (e.g. "C:\\Documents and Settings\\me\\program")
    // or wherever you have put your graph files, in order to get the file chooser to
    // start in the folder - note that in Java strings, \ is an escape character, so
    // to get a single \, you need to write \\ in the pathname of the folder.
    private static String startFolder = ".";

    /**
     * Creates and displays a graph, then runs assorted methods on the graph.
     *
     * @param args command-line arguments (ignored)
     */
    public static void main(String[] args) {

        File f = GraphUtilities.getGraphFile(startFolder); // uses a file chooser to select a file
        FriendsGraph g = GraphUtilities.readInGraph(f); // reads the file to create a graph

        printAreFriends(g, "Charlotte", "Maya");
        printAreFriends(g, "Charlotte", "Anoushka");
        printAreFriends(g, "Anoushka", "Tzvetan");
        printAreFriends(g, "Tzvetan", "Aaron");

        GeneralUtilities.depthFirstTraversal(g, "Hannah");

        showMutualFriends(g, "Agnes", "Bethan");
        showMutualFriends(g, "Nathan", "Tanaka");

        GraphUtilities.showGraph(g); // pop-up window displaying the graph
    }

    private static void printAreFriends(FriendsGraph g, String person1, String person2) {
        System.out.print(person1 + " and " + person2 + " are ");
        System.out.println(g.areFriends(person1, person2) ? "friends." : "not friends");

    }

    private static void showMutualFriends(FriendsGraph g, String person1, String person2) {
        System.out.println("=========================================");
        System.out.println("Mutual friends of " + person1 + " and " + person2);
        List<String> mutualFriends = GeneralUtilities.mutualFriends(g, person1, person2);
        for (String s:mutualFriends) {
            System.out.println(s);
        }
    }

}
