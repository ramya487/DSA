// Find the maximum no of consecutive ones that is present in the array
// O(n) O(1)
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxc = 0;
        int counter = 0;
        for (int i = 0; i<nums.length; i++){
            int ele = nums[i];
            if (ele == 0){
                if (maxc<counter){
                    maxc = counter;
                }
                counter = 0;
            }else{
                counter++;
            }
        }
        if (maxc<counter){
            maxc = counter;
        }
        return maxc;
    }
}
