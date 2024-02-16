public class GroupCard extends Card{
    protected String prompt;
    private GroupDisplayBehavior db = new GroupDisplayBehavior();

    GroupCard(String tempPrompt){
        prompt = tempPrompt;
        displayBehavior = db;
    }

    void DisplayContent(){
        displayBehavior.DisplayContent(null, prompt, null);
    }

}
