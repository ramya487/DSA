// O(n) O(1)
// Find the largest element in an unsorted array
class Solution {
    public int largestElement(int[] nums) {
        int maxval = nums[0];
        for (int i = 0; i<nums.length; i++){
            if (nums[i]>maxval){
                maxval = nums[i];
            }
        }
        return maxval;
    }
}
