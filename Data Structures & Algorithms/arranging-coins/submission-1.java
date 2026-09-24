class Solution {
    public int arrangeCoins(int n) {
        int leftCoins=n;
        int stairCase=0;
        int i=1;
        while(i<=leftCoins){
           leftCoins=leftCoins-i;
           stairCase++;
           i++;   
        } 
        return stairCase;
    }
}