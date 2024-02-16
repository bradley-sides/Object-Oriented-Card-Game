import java.util.ArrayList;

public class CardFactory {
    //FACTORY PATTERN
    Card cardMaker(String type, String prompt, String name){
        if(type == "I"){
            return new IndividualCard(prompt, name);
        }else if(type == "G"){
            return new GroupCard(prompt);
        }else if(type == "FV"){
            return new FirstVirusCard(prompt, name);
        }else if(type == "SV"){
            return new SecondVirusCard(name);
        }else{
            return null;
        }
    }
}
