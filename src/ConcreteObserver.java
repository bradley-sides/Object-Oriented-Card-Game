import java.sql.SQLOutput;

public class ConcreteObserver extends Observer{

    // Observer pattern

    ConcreteObserver() {
        super();

    }

    @Override
    void Update() {
        System.out.println("-------------------------");
        System.out.println("OBSERVER: Points increase");
        System.out.println("-------------------------");
    }

}
