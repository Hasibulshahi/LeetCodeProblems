package leet_code_problems.problem_4;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindingMedianOfArrays {
    public FindingMedianOfArrays() {
        System.out.println("********************* Median of Two Arrays ************************");
        int[] arr1 = {1,2};
        int[] arr2 = {3,4};
        System.out.println("Median: "+this.findMedianSortedArrays(arr1,arr2));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2)).toArray();
        Arrays.sort(merged);
        System.out.println(Arrays.toString(merged));
        double median;
        int n = merged.length;
        if (n%2 == 0){
            median = (double) (merged[(n / 2)-1] + merged[((n / 2) + 1)-1]) /2;
        }
        else {
            median = (double) merged[((n+1)/2)-1];
        }

        return median;
    }
}
