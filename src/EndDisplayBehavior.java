import java.util.ArrayList;

public class EndDisplayBehavior extends DisplayBehavior{
    void DisplayContent(String name, String prompt, ArrayList<Player> players){
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println("+             END OF GAME              +");
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        for(int i = 0; i < players.size(); i++){
            System.out.println(players.get(i).getName()+"..................."+players.get(i).getScore());
        }
    }
}
