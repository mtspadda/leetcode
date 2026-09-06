import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String s1 = "aab";
        String s2 = "nagaram";

    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();

        for (char r: ransomNote.toCharArray()){
            map.put(r, map.getOrDefault(r, 0) + 1);
        }
        for (char r: magazine.toCharArray()){
            map.put(r, map.getOrDefault(r, 0) - 1);

            return map.get(r) >= 0;
        }
        return false;
    }
}