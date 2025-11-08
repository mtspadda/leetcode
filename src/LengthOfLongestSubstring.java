import java.util.HashSet;

public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        int head = 0;
        int maxLength = 0;
        HashSet<Character> charSet = new HashSet<>();

        for (int ahead = 0; ahead < s.length(); ahead++){
            while(charSet.contains(s.charAt(ahead))){
                charSet.remove(s.charAt(head));
                head++;
            }

            charSet.add(s.charAt(ahead));
            maxLength = Math.max(maxLength, ahead - head + 1);
        }

        return maxLength;

    }
}
