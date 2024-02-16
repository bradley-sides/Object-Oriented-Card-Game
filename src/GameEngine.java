import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class GameEngine {

    //MAKING ALL PROMPTS AND STORING IN ARRAYLISTS

    private ArrayList<Player> players = new ArrayList<>();
    private ArrayList<Card> allCards = new ArrayList<>();

    //MAKES ALL CARDS FOR GAME
    void MakeCards(ArrayList<Player> players){
        CardFactory cf = new CardFactory();

        //ADD INDIVIDUAL CARDS
        //GENERATE RANDOM INDEX FOR PLAYER NAME
        Random rand = new Random();
        int index = rand.nextInt(players.size());
        //MAKE CARDS WITH NAMES AND GROUP PROMPTS
        Card newIndividualCard = cf.cardMaker("I", " Tell a funny story about another player or take a penalty", players.get(index).getName());
        allCards.add(newIndividualCard);
        index = rand.nextInt(players.size());

        allCards.add(cf.cardMaker("G", "Vote on who is the smartest player. They have to take two penalties",null));

        newIndividualCard = cf.cardMaker("I", " Give 2 penalties to the coolest player", players.get(index).getName());
        allCards.add(newIndividualCard);
        index = rand.nextInt(players.size());

        allCards.add(cf.cardMaker("G", "Would you rather have a rewind or a pause button in life. Everyone vote at once, losing group takes 3 penalties",null));

        newIndividualCard = cf.cardMaker("I", " Name an accessory. Everyone wearing this accessory take a penalty", players.get(index).getName());
        allCards.add(newIndividualCard);
        index = rand.nextInt(players.size());

        allCards.add(cf.cardMaker("G", "Excuses to get out of class” if you repeat, or cannot think of one, take a penalty. Player with the longest name starts",null));

        newIndividualCard = cf.cardMaker("I", " Do 40 jumps or take a penalty", players.get(index).getName());
        allCards.add(newIndividualCard);
        index = rand.nextInt(players.size());

        allCards.add(cf.cardMaker("G", "How much did your shoes cost? Once every player has answered, tap the screen. The youngest player starts",null));

        newIndividualCard = cf.cardMaker("I", " You have 3 minutes of immunity from penalties", players.get(index).getName());
        allCards.add(newIndividualCard);
        index = rand.nextInt(players.size());

        allCards.add(cf.cardMaker("G", "The tallest person ask a question to the whole group. The first player to answer can give out 3 penalties",null));

        newIndividualCard = cf.cardMaker("I", " If you have gotten into a car accident, take a penalty.", players.get(index).getName());
        allCards.add(newIndividualCard);
        index = rand.nextInt(players.size());

        allCards.add(cf.cardMaker("G", "Cocktail names. If you repeat, or cannot think of one, then take a penalty. Player with the earliest birthday in the year starts",null));

        newIndividualCard = cf.cardMaker("I", " Take a penalty if you have ever had to talk in front of the whole class and got told to talk louder by the teacher", players.get(index).getName());
        allCards.add(newIndividualCard);
        index = rand.nextInt(players.size());

        allCards.add(cf.cardMaker("G", "Chinese food or Mexican food? Everyone vote at once. Losing group take 5 penalties",null));

        newIndividualCard = cf.cardMaker("I", " If you have brown eyes take a penalty", players.get(index).getName());
        allCards.add(newIndividualCard);

        allCards.add(cf.cardMaker("G", "Going around the group, you have 1 second to say a word right after the previous one to build a correct sentence. The loser takes 4 penalties. Shortest player starts",null));


        //ADD VIRUSES INTO CARDS
        index = rand.nextInt(players.size());
        allCards.add(2,cf.cardMaker("FV", "You are now forbidden from using personal pronouns (I, you, he, etc.) until further notice, at risk of 3 penalties", players.get(index).getName()));
        allCards.add(5, cf.cardMaker("SV", null, players.get(index).getName()));

        index = rand.nextInt(players.size());
        allCards.add(4,cf.cardMaker("FV", "Every time you take a penalty, you can reflect it onto another player", players.get(index).getName()));
        allCards.add(6, cf.cardMaker("SV", null, players.get(index).getName()));

    }




    //GAME STARTS
    void playGame(){

        //DISPLAY START CARD
        StartCard sc = StartCard.getInstance();
        sc.displayContent();

        //ASK FOR ALL PLAYER NAMES AND TAKE INTO ARRAYLIST, ADD OBSERVER TO THEIR OBSERVER LIST
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        //TAKE IN NUM OF PLAYERS
        String tempNumOfPlayers = myObj.nextLine();
        //MARK DOWN NUMBER OF PLAYERS
        int numOfPlayers = Integer.parseInt(tempNumOfPlayers);

        //TAKE IN ALL PLAYER NAMES AND MAKE PLAYERS
        System.out.println("ENTER ALL PLAYERS NAMES, ONE ON EACH LINE: ");
        String names;

        // Create observer for points
        Observer pointsObs = new ConcreteObserver();

        for(int i = 0; i<numOfPlayers; i++){
            String tempName = myObj.nextLine();
            //make player with name and zero points
            Player myPlayer = new Player(tempName);
            myPlayer.registerObserver(pointsObs);
            players.add(myPlayer);
        }
        //GENERATE ALL CARDS
        MakeCards(players);

        //GAME LOOP
        for(int index = 0; index<allCards.size(); index++){
            //DISPLAY CARD INDEX WE ARE ON
            allCards.get(index).DisplayContent();
            System.out.println("How many players took penalties?");
            int numPenalties = myObj.nextInt();
            myObj.nextLine();

            for(int i = 0; i < numPenalties; i++){
                //ASK USER TO INPUT NAME OF PLAYER WHO GETS POINTS, OR NONE
                System.out.println("INPUT NAME OF PLAYER WHO HAS RECIEVED A PENALTY, OTHERWISE ENTER 'NONE'");
                String givePointTo = myObj.nextLine();
                //
                //IF INPUT WAS NOT NONE, ADD POINT TO PLAYER AND UPDATE OBSERVER
                if(givePointTo == "NONE") {
                    System.out.println(" ");
                }else{
                    for(int j = 0; j<players.size(); j++){
                        if(players.get(j).getName().equals(givePointTo)){
                            players.get(j).setScore(players.get(j).getScore()+1);
                        }
                    }
                }
            }
        }


        //MAKE END CARD AND DISPLAY
        EndCard ec = EndCard.getInstance(players);
        ec.displayContent();
        }
    }





