public class StrStr {
    public int strStr(String haystack, String needle) {
        int window = needle.length();

        if (haystack.length() < needle.length()) {
            return -1;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++){
            if (haystack.substring(i, i + window).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
