class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int consecutiveOnes=0;
        int countOnes=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                 countOnes++;
            }else {
                consecutiveOnes=Math.max(consecutiveOnes,countOnes);
                countOnes=0;
            }
        }
        return Math.max(consecutiveOnes,countOnes);
    }
}