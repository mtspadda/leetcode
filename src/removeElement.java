public class removeElement {
    public int remove(int[] nums, int val) {
        int k = 0; // Represents the number of elements not equal to val

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                // If the current element is not equal to val, move it to the front of the array
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
