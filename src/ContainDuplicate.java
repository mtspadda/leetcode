import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainDuplicate {
        public boolean containsDuplicate(int[] nums) {

            if (nums.length <= 1) return false;
            Set<Integer> set = new HashSet<>();
            for (int num : nums) {
                if (set.contains(num)) return true;
                set.add(num);
            }

            return false;
        }

        /*
        HashSet
        num = [1, 2, 3, 1]
               id
        */

        }