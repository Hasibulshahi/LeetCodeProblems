package top_150_problems.two_pointer.problem_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public ThreeSum(){
        System.out.println("***************** 15. 3Sum ********************");
        int[] num = {0,0,0};
        System.out.println(Arrays.toString(this.threeSum(new int[]{0,0,0})));
        List<List<Integer>> result = this.threeSumTwoPointer(num);

        // Print results
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }

    public int[] threeSum(int[] numbers){
        int left = 1;
        int right = numbers.length - 1;

        for (int i=0; i<numbers.length; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                int sum = numbers[i] + numbers[j] + numbers[right];
                System.out.println(numbers[i] + " + " + numbers[left] + " + " + numbers[right] + " = " + sum);

                if (sum == 0) {
                    // If you need 1-based indexing (LeetCode style), return new int[]{left+1, right+1};
                    return new int[]{numbers[i],numbers[j],numbers[right]};
                }
                j++;
                right--;
            }
        }

        return new int[]{}; // if no solution found
    }

    public List<List<Integer>> threeSumTwoPointer(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums); // two-pointer works only on sorted array

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicates

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // skip duplicates
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return res;
    }
}
