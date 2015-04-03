package nyc.c4q.hoshikoo;
/**
 * Created by Hoshiko on 4/2/15.
 */

import java.util.HashSet;
import java.util.HashMap;

public class Scratch{

    public static void main(String[] args) {
        HashSet<Integer> odd = new HashSet<Integer>();
        odd.add(1);
        odd.add(3);
        odd.add(3);
        odd.add(57);
        odd.remove(100);
        //System.out.println(odd);

        HashSet<Integer> even = new HashSet<Integer>();
        even.add(2);
        even.add(1);
        even.add(3);
        even.add(4);

        odd.removeAll(even); //odd-even
        //System.out.println(odd);


//        for(Integer num:even){
//            odd.add(num);
//        }//add evens to odd
//
//        for(Integer num:odd){
//            System.out.println(num);
//        }

        HashMap<String, Integer> fruitCount = new HashMap<String, Integer>();
        fruitCount.put("bananas", 3);
        fruitCount.put("apples", 99);
        for (String fruit : fruitCount.keySet()) {
            System.out.println(fruit);
        }
        for (Integer fruit : fruitCount.values()) {
            System.out.println(fruit);
        }

    }
}
