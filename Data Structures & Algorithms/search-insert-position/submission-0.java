class Solution {
    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums,0,nums.length-1,target);
    }
    
    private static int binarySearch(int[] nums,int left,int right,int target){
        if(left>right){
            return left;
        }
        int middle=left+(right-left)/2;
        if(nums[middle]==target){
            return middle;
        }
        if(nums[middle]<target){
            return binarySearch(nums,middle+1,right,target);
        }
        return binarySearch(nums,0,middle-1,target);
    }

}