package top_150_problems.easy.problem_26;

import java.util.Arrays;

public class RemoveDuplicatElement {
    public RemoveDuplicatElement() {
        System.out.println("****************** 26. Remove Duplicat Element *******************");
        int[] num = {1,1,2};
        int val = 2;
        System.out.println(this.removeDuplicateElement(num));
    }
    public int removeDuplicateElement(int[] nums) {
        int counter = 0;
        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++) {
                if (nums[i] == nums[j]){
                    nums[i] = 10000;
                    counter++;
                }
            }
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        return nums.length-counter;
    }
}
