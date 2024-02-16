import java.util.ArrayList;

public class SecondVirusDisplayBehavior extends DisplayBehavior{
    void DisplayContent(String name, String prompt, ArrayList<Player> players){
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+              END VIRUS               +");
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println(name+" no longer has a virus!");
    }
}
