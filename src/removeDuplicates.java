public class removeDuplicates {
    public int remove(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int k = 1; // Number of unique elements
        // if there is one element at least, that element will be unique.

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                // compare current with the number before, if they're diferent we have a unique number
                nums[k] = nums[i];
                k++;
            }
        }


        return k;
    }

}
