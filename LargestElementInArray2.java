/*
Write a program to find the largest element in the Array along with the lowest index that it occurs in
O(n) O(1)
*/

import java.util.Arrays;
class Solution {
    String largestElement(int[] nums){
        int maxValue = nums[0];
        int lIndex = 0;
        for (int i = 0; i<nums.length; i++){
            int n = nums[i];
            if (n>maxValue){
                maxValue = n;
                lIndex = i;
            }
        }
        return Arrays.toString(new int[]{maxValue, lIndex});
    }
}

public class Main
{
	public static void main(String[] args) {
		System.out.println(new Solution().largestElement(new int[]{1,2,3,4,4}));
	}
}
