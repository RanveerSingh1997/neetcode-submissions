class Solution {
    public boolean isValid(String s) {
       List<Character> openParenthesis = List.of('(','{','['); 
       Stack<Character> stack = new Stack<>();
       for(int i=0;i<s.length();i++){
          char current = s.charAt(i);
          if(openParenthesis.contains(s.charAt(i))){
            stack.push(current);
          }else {
             if (stack.isEmpty()) {
                return false;
            }
            if(current ==')' && stack.peek()!='('){
                return false;
            }
            if(current =='}' && stack.peek()!='{'){
                return false;
            }
            if(current ==']' && stack.peek()!='['){
                return false;
            }
            stack.pop();
          }
       }
       return stack.isEmpty(); 
    }
}
