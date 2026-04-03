import java.util.*;

public class Friends {
    static HashMap<String, List<String>> friendsMap = new HashMap<>();

    public static void addFriends(String a, String b) {
        if (!friendsMap.containsKey(a)) {
            friendsMap.put(a, new ArrayList<>());
        }
        if (!friendsMap.containsKey(b)) {
            friendsMap.put(b, new ArrayList<>());
        }

        if (!friendsMap.get(a).contains(b)) {
            friendsMap.get(a).add(b);
        }
        if (!friendsMap.get(b).contains(a)) {
            friendsMap.get(b).add(a);
        }
    }

    public static void removeFriends(String a, String b) {
        if (friendsMap.containsKey(a)) {
            friendsMap.get(a).remove(b);
        }
        if (friendsMap.containsKey(b)) {
            friendsMap.get(b).remove(a);
        }
    }

    public static void main(String[] args) {
        addFriends("Ali", "Sadi");
        addFriends("Ali", "John");
        addFriends("Sadi", "Mark");

        System.out.println(friendsMap);

        removeFriends("Ali", "Sadi");

        System.out.println(friendsMap);
    }
}