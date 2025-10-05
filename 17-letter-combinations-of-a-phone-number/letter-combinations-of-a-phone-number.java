class Solution {
    private static final String[] Mapp={
        "", "","abc","def","ghi",
        "jkl","mno","pqrs","tuv","wxyz"
    };
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
        if(digits==null || digits.length()==0) return res;
        back(digits,0,new StringBuilder(),res);
        return res;
    }
    private void back(String dig,int ind,StringBuilder curr,List<String> res)
    {
        if(ind==dig.length())
        {
            res.add(curr.toString());
            return;
        }
        String lett=Mapp[dig.charAt(ind)-'0'];
        for(char c:lett.toCharArray())
        {
            curr.append(c);
            back(dig,ind+1,curr,res);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}