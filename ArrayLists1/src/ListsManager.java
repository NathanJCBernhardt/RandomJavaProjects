
import java.util.*;

public class ListsManager {

    public ArrayList<String> highPriority, lowPriority;  // the two lists of tasks
    public TaskListGUI controller; // a reference to the main program, with the GUI

    /* Constructs a ListManager object. */
    public ListsManager(TaskListGUI ref) {
        // (you should not change the code in this method)
        controller = ref;
        initialiseLists();
    }

    /* Initialises both lists, to initially be empty. */
    public void initialiseLists() {
        highPriority = new ArrayList<>();
        lowPriority = new ArrayList<>();
    }



    public void addTask(String task) {
        lowPriority.add(task);
    }


    public void removeLowPriorityTask(int index) {
        lowPriority.remove(index);
    }


    public void removeHighPriorityTask(int index) {
        highPriority.remove(index);


    }

    public void changePriority(boolean important, int index) {
        if (important == false){
            highPriority.add(lowPriority.get(index));
            removeLowPriorityTask(index);
        }
        else if(important == true){
            lowPriority.add(highPriority.get(index));
            removeHighPriorityTask(index);
        }


    }

    /* Produces a string that can be used to save the task lists. */
    public String toString() {

        return "";  // dummy return value (before this method is implemented)
    }

    public void promote(int index) {
        if(index == 0){
            //do nothing
             
        }else{
            String temp;
            temp = highPriority.get(index);
            highPriority.set(index, highPriority.get(index - 1));
            highPriority.set(index - 1, temp);
        }


    }
}
