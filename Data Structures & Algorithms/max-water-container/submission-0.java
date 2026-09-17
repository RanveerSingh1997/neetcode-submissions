class Solution {
    public int maxArea(int[] heights) {
      int maxArea=0;
      int left=0;
      int right=heights.length-1;
      while(left<right){
          int currentArea=0;
          if(heights[left]<heights[right]){
             currentArea= (right-left)*heights[left];
             left++;
          }else if(heights[left]>heights[right]){
             currentArea= (right-left)*heights[right];
             right--;
          } else {
            currentArea= (right-left)*heights[right];
            left++;
            right--;
          }
          if(maxArea<currentArea){
            maxArea=currentArea;
          }
      }
      return maxArea; 
    }
}
