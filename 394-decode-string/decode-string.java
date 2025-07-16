class Solution {
    public String decodeString(String s) {
        Stack<String> stack=new Stack();
        StringBuilder curr=new StringBuilder();
        int currnum=0;

        for(char c: s.toCharArray())
        {
            if(Character.isDigit(c))
            {

                currnum=currnum*10+(c-'0');
            }
            else if(c=='[')
            {
                stack.push(curr.toString());
                stack.push(String.valueOf(currnum));
                curr=new StringBuilder();
                currnum=0;
            }
            else if(c==']')
            {
                int rep=Integer.parseInt(stack.pop());
                StringBuilder temp=new StringBuilder(stack.pop());

                for(int i=0;i<rep;i++)
                {
                    temp.append(curr);
                }
                curr=temp;
            }
            else
            {
                curr.append(c);
            }
        }
        return curr.toString();
    }
}