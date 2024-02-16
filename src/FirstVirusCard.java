public class FirstVirusCard extends Card{
    private FirstVirusDisplayBehavior db = new FirstVirusDisplayBehavior();
    private String name;
    private String prompt;


    FirstVirusCard(String tempPrompt, String tempName){
        displayBehavior = db;
        prompt = tempPrompt;
        name = tempName;
    }

    void DisplayContent(){
        displayBehavior.DisplayContent(name, prompt, null);
    }
}
