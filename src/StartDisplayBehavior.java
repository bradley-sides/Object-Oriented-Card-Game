import java.util.ArrayList;

public class StartDisplayBehavior extends DisplayBehavior{
    @Override
    void DisplayContent(String name, String prompt, ArrayList<Player> players) {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+         WELCOME TO PENALTIES!         +");
        System.out.println("+      ENTER THE NUMBER OF PLAYERS      +");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
    }
}
