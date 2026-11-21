/*
Write a program to find the second largest distinct element in the array. If the required element is not present then return -1
*/
// Brute force approach - O(nlogn) O(n)
import java.util.Arrays;
class Solution {
    public int secondLargestElement(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        if (len == 0){
            return -1;
        }
        int maxele = nums[len-1];
        for (int i=len-1; i>=0; i--){
            if (nums[i] != maxele){
                return nums[i];
            }
        }
        return -1;
    }
}

// Better approach - O(2n) O(1)
import java.util.Arrays;
class Solution {
    public int secondLargestElement(int[] nums) {
        if (nums.length < 1){
            return -1;
        }
        int fmax,smax;
        fmax = nums[0];
        for (int num: nums){
            if (num>fmax){
                fmax = num;
            }
        }
        smax = 0;
        boolean sfound = false;
        for (int num: nums){
            if (num<fmax){
                if (!sfound || num>smax){
                    smax = num;
                    sfound = true;
                }
            }
        }
        if (!sfound){
            return -1;
        }
        return smax;
    }
}

// Optimal approach - O(n) O(1)
