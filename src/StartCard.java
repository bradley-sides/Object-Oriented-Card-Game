public class StartCard extends Card{
    private static StartCard uniqueInstance;
    private StartDisplayBehavior db = new StartDisplayBehavior();
    private StartCard(){
        displayBehavior = db;
    }
    public static synchronized StartCard getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new StartCard();
        }
        return uniqueInstance;
    }

    void displayContent(){
        displayBehavior.DisplayContent(null,null,null);
    }

}
