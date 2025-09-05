package top_150_problems.array_string.problem_88;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeSortedArray {
    public MergeSortedArray() {
        System.out.println("****************** 88. Merge Sorted Array *******************");
        int[] nums1 = {0};
        int[] nums2 = {1};
        int m = 0, n = 1;
        this.MergeArray(nums1, nums2, m, n);
    }
    public void MergeArray(int[] nums1, int[] nums2, int m, int n){
        int o = m+n, k=0;
        for (int i=0; i<o; i++){
            if (i<m){
                nums1[i] = nums1[i];
            }
            else {
                nums1[i] = nums2[k];
                k++;
            }
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
