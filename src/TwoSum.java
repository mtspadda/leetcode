import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }

            numMap.put(nums[i], i);

        }

        return new int[]{};
    }

    public static void Main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);

        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }
        // Output will be 0 1, as nums[0] + nums[1] equals the target 9
    }
}
