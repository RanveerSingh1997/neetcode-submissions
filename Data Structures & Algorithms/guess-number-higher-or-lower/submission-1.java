/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
      return binarySearch(1,n);     
    }
    private int binarySearch(int left,int right){
       int middle=left+(right-left)/2;
       int result= guess(middle);
       if(result==0){
         return middle;
       }
       if(result==-1){
         return binarySearch(left,middle-1);
       }
       return binarySearch(middle+1,right);
    }


}