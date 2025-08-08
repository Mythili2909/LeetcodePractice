class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        char[] arr=s.toCharArray();

        for(char c:arr)
        {
            if(c=='('||c=='{'||c=='[')
            {
                stack.push(c);
            }
            else if(c==')' && !stack.isEmpty() && stack.peek()=='(')
            {
                stack.pop();
            }
            else if(c==']' && !stack.isEmpty() && stack.peek()=='[')
            {
                stack.pop();
            }
            else if(c=='}' && !stack.isEmpty() && stack.peek()=='{')
            {
                stack.pop();
            }
            else 
            {
                return false;
            }
        }
        return stack.isEmpty();
    }
}