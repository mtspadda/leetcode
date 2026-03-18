import java.sql.Array;
import java.util.ArrayList;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse from the end
        for (int i = n - 1; i >= 0; i--) {
            // If digit is less than 9, just increment and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If digit is 9, set to 0 and continue (carry over)
            digits[i] = 0;
        }

        // If all digits were 9, create a new array
        int[] result = new int[n + 1];
        result[0] = 1; // rest are already 0
        return result;
    }
    }

