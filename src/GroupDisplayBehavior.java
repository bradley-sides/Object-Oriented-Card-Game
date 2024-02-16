import java.util.ArrayList;

public class GroupDisplayBehavior extends DisplayBehavior{
    void DisplayContent(String name, String prompt, ArrayList<Player> players){
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+              GROUP CARD              +");
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println("All group members! " + prompt);
    }
}
