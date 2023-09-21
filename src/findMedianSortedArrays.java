class findMedianSortedArrays {

//    Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
//
//    The overall run time complexity should be O(log (m+n)).
//    Example 1:
//
//    Input: nums1 = [1,3], nums2 = [2]
//    Output: 2.00000
//    Explanation: merged array = [1,2,3] and median is 2.
//    Example 2:
//
//    Input: nums1 = [1,2], nums2 = [3,4]
//    Output: 2.50000
//    Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

    public double findMedian(int[] nums1, int[] nums2){
        if (nums1.length > nums2.length){
            return findMedian(nums1, nums2);
        }
        // nums1 = [1,3] nums2 = [2]
        int m = nums1.length; // m = 2
        int n = nums2.length; // n = 1
        int left = 0;
        int right = m; // right = 2
        int part1, part2;
        int maxLeft1, minRight1, maxLeft2, minRight2;

        while (left <= right){ // 0 <= 2
            part1 = (left + right) / 2; // part1 = 1
            part2 = (m + n + 1) / 2 - part1; // part2 = 3

            maxLeft1 = (part1 == 0) ? Integer.MIN_VALUE : nums1[part1 - 1];
            minRight1 = (part1 == m) ? Integer.MAX_VALUE : nums1[part1];
            maxLeft2 = (part2 == 0) ? Integer.MIN_VALUE : nums2[part2 - 1];
            minRight2 = (part2 == n) ? Integer.MAX_VALUE : nums2[part2];

            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
                if ((m + n) % 2 == 0) {
                    return (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2.0;
                } else {
                    return Math.max(maxLeft1, maxLeft2);
                }
            } else if (maxLeft1 > minRight2) {
                right = part1 - 1;
            } else {
                left = part1 + 1;
            }
        }

        throw new IllegalArgumentException("Input arrays are not sorted.");
    }
}
