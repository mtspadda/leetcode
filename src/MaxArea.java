import java.util.Arrays;

public class MaxArea {

    public int maxArea(int[] height){
        int start = 0;
        int end = height.length - 1;
        int maxArea = 0;

        while(start < end){
            maxArea = Math.max(maxArea, (end - start) * Math.min(height[start], height[start]));
        }

        if (height[start] < height[end]) {
            start++;
        } else {
            end--;
        }

        return maxArea;
    }
}
