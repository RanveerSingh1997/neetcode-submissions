class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int left=0;
       int right=numbers.length-1;
       while(left<right){
           int targetNumner=numbers[left]+numbers[right];
           if(targetNumner== target) {
             return new int[] {left+1,right+1};
           }
           if (targetNumner>target){
                right--;
           }else {
                left++;
           }  
       } 
       return new int[]{};
    }
}
