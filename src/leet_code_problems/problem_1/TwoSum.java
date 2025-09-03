package leet_code_problems.problem_1;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
//
//Example 1:
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//
//Example 2:
//Input: nums = [3,2,4], target = 6
//Output: [1,2]

import java.util.HashMap;

public class TwoSum {

    public TwoSum(){
        System.out.println("***************** Two Sum ********************");
        this.twoSumManual();
        this.twoSumWithHashMap();
    }

    public void twoSumManual(){
        System.out.println("Two Sum without hasFunc: ");
        int[] arr = {3,2,4,1};
        int terget = 6;

        for (int i=0; i<=arr.length-1; i++){
            for (int j=1; j<= arr.length-i-1; j++){
                int sum = 0;
                if (arr[i]!=arr[j]){
                    sum = arr[i]+arr[j];
                }
                if (sum == terget) {
                    System.out.println(i+" + "+j+" = "+sum);
                    return;
                }
            }
        }
    }

    public void twoSumWithHashMap() {
        System.out.println("Two Sum using HashMap: ");
        int[] arr = {3, 2, 4, 1};
        int target = 5;

        // Map to store number -> index
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            // Check if complement exists in map
            if (map.containsKey(complement)) {
                System.out.println(map.get(complement) + " + " + i + " = " + target);
                return; // Exit after finding the first pair
            }

            // Store current number with its index
            map.put(arr[i], i);
        }

        System.out.println("No two numbers sum up to the target.");
    }
}
