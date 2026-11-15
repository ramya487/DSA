/*
Given an integer array and a target element, find the lowest index where the element occurs in the array
O(n) O(1)
*/

class Solution {
    public int linearSearch(int[] nums, int target){
        int n = nums.length;
        for (int i = 0; i<n; i++){
            if (nums[i] == target){
                return i;
            }
        }
        return -1;
    }
}
public class Main
{
	public static void main(String[] args) {
		System.out.println(new Solution().linearSearch(new int[]{1,2,3,4}, 4));
		System.out.println(new Solution().linearSearch(new int[]{1,2,3,4}, 9));
	}
}
