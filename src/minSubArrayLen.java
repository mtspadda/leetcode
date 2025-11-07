public class minSubArrayLen {
    public int minSubArrayLen(int target, int[] nums){
        int minlen = Integer.MIN_VALUE;
        int head = 0;
        int curSum = 0;
        /**
            targer = 7
            nums = [1,2,3,4,5,6]
                    h
                      a
                    0 + 1

         */
        for (int ahead = 0; ahead < nums.length; ahead++){
            curSum = curSum + nums[ahead];

            while (curSum >= target){
                if (ahead - head + 1 < minlen){
                    minlen = ahead - head + 1;
                }
                curSum -= nums[head];
                head++;
            }
        }
        return minlen != Integer.MAX_VALUE ? minlen : 0;
    }
}
