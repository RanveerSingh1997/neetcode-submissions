class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
         
        for(String str: tokens){
            if(!stack.isEmpty()){
              if(!str.equals("*") && !str.equals("/") && !str.equals("+") && !str.equals("-")){
                stack.push(Integer.parseInt(str));
              }else {
                 
                int value1 =stack.pop();
                int value2 =stack.pop();
                int result;
                if(str.equals("*")){
                  result=value2*value1;
                }else if(str.equals("/")){
                  result=value2/value1;
                }else if(str.equals("+")){
                   result=value2+value1;
                }else {
                  result=value2-value1;
                }
                stack.push(result);
              }
            }else {
               stack.push(Integer.parseInt(str));
            } 
        }
        return stack.pop();
    }
}
