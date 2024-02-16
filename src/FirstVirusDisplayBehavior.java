import java.util.ArrayList;

public class FirstVirusDisplayBehavior extends DisplayBehavior{
    void DisplayContent(String name, String prompt, ArrayList<Player> players){
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+                VIRUS                 +");
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println(name+": "+prompt);
    }
}
