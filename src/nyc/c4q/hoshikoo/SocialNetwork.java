package nyc.c4q.hoshikoo;
/**
 * Created by Hoshiko on 4/2/15.
 */
import java.util.HashSet;

public class SocialNetwork {

    public static void main(String[] args) {
        HashSet<String> yours = new HashSet();
        yours.add("Yelena");
        yours.add("Jamal");
        yours.add("Eve");
        HashSet<String> mine = new HashSet();
        mine.add("Sebastian");
        mine.add("Mala");
        mine.add("Eve");

        // You should be able to run all of these in a row:
        System.out.println( allFriends(yours, mine) );
        System.out.println( mutualFriends(yours, mine) );
        System.out.println( justYourFriends(yours, mine) );
        System.out.println( justMyFriends(yours, mine) );
        System.out.println( exclusiveFriends(yours, mine) );
        System.out.println( yourFriendsAreMine(yours, mine) );
        System.out.println( youHaveFriends(yours) );
        System.out.println( matchmaker(yours, mine) );
    }

    public static HashSet<String> allFriends(HashSet<String> yours, HashSet<String> mine) {
        // Yelena, Jamal, Eve, Sebastian, Mala
        HashSet<String>ourFriends = new HashSet<String>();

//        for(String friendName : mine){
//            yours.add(friendName);
//        }
        ourFriends.addAll(yours);
        ourFriends.addAll(mine);
        return ourFriends;
    }

    public static HashSet<String> mutualFriends(HashSet<String> yours, HashSet<String> mine) {
        // Eve
        HashSet<String> mutualFriendsName = new HashSet<String>();
        for(String friendName :yours){
            if(mine.contains(friendName)){
                mutualFriendsName.add(friendName);
            }
        }
    return mutualFriendsName;

    }

    public static HashSet<String> justYourFriends(HashSet<String> yours, HashSet<String> mine) {
        // Yelena, Jamal
        HashSet<String> justYourFriendsName = new HashSet<String>(yours);
        justYourFriendsName.removeAll(mine);

        return justYourFriendsName;
    }

    public static HashSet<String> justMyFriends(HashSet<String> yours, HashSet<String> mine) {
        // Sebastian, Mala
        HashSet<String> justMyFriendsName = new HashSet<String>(mine);
        justMyFriendsName.removeAll(yours);

        return justMyFriendsName;

    }

    public static HashSet<String> exclusiveFriends(HashSet<String> yours, HashSet<String> mine) {
        // Yelena, Jamal, Sebastian, Mala

//        HashSet<String> exclusiveFriendsName = new HashSet<String>(allFriends(yours, mine));
//        exclusiveFriendsName.removeAll(mutualFriends(yours, mine));

        HashSet<String> exclusiveFriendsName = new HashSet<String>(justYourFriends(yours, mine));
        exclusiveFriendsName.addAll(justMyFriends(yours, mine));
        return exclusiveFriendsName;

    }

    public static boolean yourFriendsAreMine(HashSet<String> yours, HashSet<String> mine) {
        // true if all your friends are also my friends
        if(yours.size() > mine.size()){
            return false;
        }else {
            for(String friendName :yours){
                if(!mine.contains(friendName)){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean youHaveFriends(HashSet<String> yours) {
        // true if you have any friends
        if(yours.size()>0){
            return true;
        }else{
            return false;
        }

    }

    public static HashSet<HashSet<String>> matchmaker(HashSet<String> yours, HashSet<String> mine) {

        // should return these sets:

        // Sebastian, Jamal
        // Jamal, Mala
        // Jamal, Eve

        // Sebastian, Yelena
        // Yelena, Mala
        // Yelena, Eve

        // Sebastian, Eve
        // Mala, Eve

        HashSet<HashSet<String>> matches = new HashSet<HashSet<String>>();

        for (String yourFriendsName :yours){
            for(String myFriendsName :mine){
                HashSet<String> individualMatches = new HashSet <String>();
                if(!myFriendsName.equals(yourFriendsName)){
                    individualMatches.add(myFriendsName);
                    individualMatches.add(yourFriendsName);
                    matches.add(individualMatches);
                }
            }
        }
        return matches;
    }
}

