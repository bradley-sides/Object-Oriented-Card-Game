public class IndividualCard extends Card{
    protected String prompt;
    protected String name;
    private IndividualDisplayBehavior db = new IndividualDisplayBehavior();

    IndividualCard(String tempPrompt, String tempName){
        prompt = tempPrompt;
        name = tempName;
        displayBehavior = db;
    }

    void DisplayContent(){
        displayBehavior.DisplayContent(name, prompt, null);
    }



}
