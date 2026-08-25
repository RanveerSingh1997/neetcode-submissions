class Solution {
    public int[] productExceptSelf(int[] nums) {
      int length = nums.length;
      int[] result = new int[length];
       
      Arrays.fill(result,1);
      
      int pre=1, post =1;
      
      for(int i=0;i<length;i++){
         result[i] =pre;
         pre=nums[i]*pre;
      }

      for(int i=length-1;i>=0;i--){
         result[i]= result[i]*post;
         post = post*nums[i];
      }
      return result;
    }
}  
