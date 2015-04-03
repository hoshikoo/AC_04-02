/**
 * Created by Hoshiko on 4/2/15.
 */
import java.util.HashMap;
import java.util.HashSet;

public class test {

    public static void main(String[] args) {
        HashMap<String, Integer> surfers = new HashMap<String, Integer>();

        surfers.put("Jana", 1);
        surfers.put("Woody", 2);
        surfers.put("Stormie", 3);
        surfers.put("Sebastian", 4);
        surfers.put("Dale", 5);

        for (Integer place: surfers.values()) {
            System.out.println(place);
        }

        HashSet<String> beaches = new HashSet<String>();
        beaches.add("Huntington Beach");
        beaches.add("Playa Grande");
        beaches.add("Gold Coast");
        beaches.add("Jeffery's Bay");

        // Clone beaches into another HashSet called bigWaves
        HashSet<String> bigWaves = new HashSet<String>(beaches);
        System.out.println(bigWaves.equals (beaches));
    }
}