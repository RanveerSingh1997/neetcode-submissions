class Solution {
    public int minOperations(String[] logs) {
        Stack<String> stack=new Stack();
        String root=logs[0];
        for(String str:logs){
            if(str.equals("../")){
                 if(!stack.isEmpty()){
                     stack.pop();
                 }   
            }else if(str.equals("./")){
                continue;
            }else {
               stack.push(str);
            }
        }
        return stack.size();
    }
}