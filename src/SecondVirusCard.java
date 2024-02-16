public class SecondVirusCard extends Card{

    //IMPLEMENTS SINGLETON PATTERN
    private SecondVirusDisplayBehavior db = new SecondVirusDisplayBehavior();
    private String name;


    SecondVirusCard(String tempName){
        displayBehavior = db;
        name = tempName;
    }

    void DisplayContent(){
        displayBehavior.DisplayContent(name, null, null);
    }
}

