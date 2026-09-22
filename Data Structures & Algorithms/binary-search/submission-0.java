class Solution {
    public int search(int[] nums, int target) {
       return binarySearch(nums,target,0,nums.length-1); 
    }
    private static int binarySearch(int [] array,int target,int left,int right){
        if(left>right){
            return -1;
        }
        int middleIndex=left+(right-left)/2;
        if(array[middleIndex]==target){
            return middleIndex;
        }
        if(array[middleIndex]<target){
            return binarySearch(array,target,middleIndex+1,right);
        }
        return binarySearch(array,target,left,middleIndex-1);
    }
}
