class Solution {
    public int[][] merge(int[][] arr) {
      ArrayList<int[]> res=new ArrayList<>();
      int n=arr.length;
      Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
      for(int i=0;i<n;i++)
      {
        if(res.isEmpty() || arr[i][0]>res.get(res.size()-1)[1])
        {
            res.add(arr[i]);

        }
        else
        {
           int[] last = res.get(res.size() - 1);
                last[1] = Math.max(last[1], arr[i][1]);
            // (res.size()-1)[1]=max(res.get(res.size()-1).get(1),arr[i][1]);
        }
      } 
      return res.toArray(new int[res.size()][]); 
    }
}