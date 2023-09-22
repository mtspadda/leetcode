public class Main {
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = TwoSum.twoSum(nums, target);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}