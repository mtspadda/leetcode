import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magazineFrequency = new HashMap<>();

        // Count the frequency of each character in the magazine
        for (char c : magazine.toCharArray()) {
            magazineFrequency.put(c, magazineFrequency.getOrDefault(c, 0) + 1);
        }

        // Check if the characters in the ransomNote can be constructed from the magazine
        for (char c : ransomNote.toCharArray()) {
            if (!magazineFrequency.containsKey(c) || magazineFrequency.get(c) == 0) {
                return false; // Character not found in magazine or its frequency is exhausted
            }
            magazineFrequency.put(c, magazineFrequency.get(c) - 1);
        }

        return true;
    }
}
