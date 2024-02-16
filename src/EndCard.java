import java.util.ArrayList;
public class EndCard extends Card{

    //IMPLEMENTS SINGLETON PATTERN
    private static EndCard uniqueInstance;
    private ArrayList<Player> players;
    EndDisplayBehavior db = new EndDisplayBehavior();
    private EndCard(ArrayList<Player> myPlayers){
        displayBehavior = db;
        players = myPlayers;
    }
    public static synchronized EndCard getInstance(ArrayList<Player> myPlayers){
        if(uniqueInstance == null){
            uniqueInstance = new EndCard(myPlayers);
        }
        return uniqueInstance;
    }

    void displayContent(){

        displayBehavior.DisplayContent(null,null, players);
    }

}

