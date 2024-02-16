import java.util.ArrayList;

public class IndividualDisplayBehavior extends DisplayBehavior{
    void DisplayContent(String name, String prompt, ArrayList<Player> players){
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+           INDIVIDUAL CARD            +");
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println(name+": "+ prompt);
    }
}
