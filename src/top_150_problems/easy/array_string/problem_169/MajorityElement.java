package top_150_problems.easy.problem_169;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public MajorityElement(){
        System.out.println("****************** 169. Majority Element *******************");
        int[] num = {3,3,4};
        System.out.println(this.majorityElement(num));
    }
    public int majorityElement(int[] nums) {
        int m = nums.length/2;
        HashMap<Integer, Integer> map = new HashMap<>();
        // Count occurrences
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int element = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > m) {
                element = entry.getKey();
            }
        }

        map.forEach((key, value) ->
                System.out.println("Key: " + key + ", Value: " + value)
        );
        System.out.println("m: "+m+" map: "+map.size());
        return element;
    }
}
