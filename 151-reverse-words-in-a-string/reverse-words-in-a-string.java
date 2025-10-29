class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] s1=s.split("\\s+");
        StringBuilder str=new StringBuilder();

        for(int i=s1.length - 1;i>=0;i--)
        {
            str.append(s1[i]);
            if(i!=0)
            {
                str.append(" ");
            }
        }
        return str.toString();
    }
    
}