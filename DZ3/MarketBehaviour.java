package DZ3;
import java.util.List;

public interface MarketBehaviour {
    void addPerson(String name, List<String> products, int price);
    void removePerson(Person name);
    void update();
}
