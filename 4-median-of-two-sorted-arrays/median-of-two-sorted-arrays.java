class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        ArrayList<Integer> arr=new ArrayList<>();
        int sum=0;
        for(int i=0;i<m;i++)
        {
            arr.add(nums1[i]);
        }
        for(int i=0;i<n;i++)
        {
            arr.add(nums2[i]);
        }
        Collections.sort(arr);
        int tot=arr.size();
        if(tot%2==0)
        {

            return (arr.get(tot/2)+arr.get((tot/2)-1))/2.0;
        }
        else
        {
             return arr.get(tot/2);
        }
        
    }
}