class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> arr=new ArrayList<>();
       res(arr,0,0,"",n);
        return arr;
    }
    private void res(List<String>arr,int l,int r,String str,int n)
    {
        if(str.length()==n*2)
        {
            arr.add(str);
            return;
        }
        if(l<n) res(arr,l+1,r,str+"(",n);
        
        if(r<l) res(arr,l,r+1,str+")",n);
    }
}