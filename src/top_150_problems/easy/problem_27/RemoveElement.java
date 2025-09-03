package top_150_problems.easy.problem_27;

import java.util.Arrays;
import java.util.Collections;

public class RemoveElement {
    public RemoveElement() {
        System.out.println("****************** 27. Remove Element *******************");
        int[] num = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(this.removeElement(num,val));
    }
    public int removeElement(int[] nums, int val) {
        int counter = 0;
        for (int i=0; i<nums.length; i++){
            if (nums[i] == val){
                nums[i] = 100000;
                counter++;
            }
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        return nums.length-counter;
    }
}
