class Solution {
    public int calPoints(String[] operations) {
       Stack<Integer> s=new Stack();
       int sum=0;
       for (String operation : operations){
         if(operation.equals("+")){
            int value1=s.pop();
            int value2=s.peek();
            int newScore= value1+value2;
            s.push(value1); 
            s.push(newScore);
            sum+=newScore; 
         }else if(operation.equals("D")){
           int newScore= s.peek()*2;
           s.push(newScore);
           sum+=newScore;
         }else if(operation.equals("C")){
            int newScore =  s.peek();
            sum-=newScore;
            s.pop();
         }else{
            int newScore = Integer.parseInt(operation);
            s.push(newScore);
            sum+=newScore;
         }
        
       } 
        
       return sum; 
    }
}