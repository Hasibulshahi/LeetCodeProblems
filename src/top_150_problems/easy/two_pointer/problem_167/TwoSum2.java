package top_150_problems.easy.two_pointer.problem_167;

import java.util.Arrays;

public class TwoSum2 {
    public TwoSum2() {
        System.out.println("***************** 167. Two Sum II - Input Array Is Sorted ********************");
        int[] numbers = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(this.twoSum(numbers, target)));
    }
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            System.out.println(numbers[left] + " + " + numbers[right] + " = " + sum);

            if (sum == target) {
                // If you need 1-based indexing (LeetCode style), return new int[]{left+1, right+1};
                return new int[]{left+1, right+1};
            }
            else if (sum < target) {
                left++;  // need a bigger sum → move left pointer
            }
            else {
                right--; // need a smaller sum → move right pointer
            }
        }
        return new int[]{-1, -1}; // if no solution found
    }
}
