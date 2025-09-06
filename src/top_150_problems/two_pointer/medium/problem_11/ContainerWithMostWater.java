package top_150_problems.two_pointer.medium.problem_11;

import java.util.Arrays;

public class ContainerWithMostWater {
    public ContainerWithMostWater(){
        System.out.println("***************** 11. Container With Most Water ********************");
        int[] num = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(this.maxArea(num));
    }
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1;
        int maxArea = 0;
        while (left < right){
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, area);

            // Move the smaller height inward
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
