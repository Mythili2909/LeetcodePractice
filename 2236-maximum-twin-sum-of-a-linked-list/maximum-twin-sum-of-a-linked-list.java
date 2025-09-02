
class Solution {
    private static int [] a = new int[100000];
    public int pairSum(ListNode head) {

        
        final int[] arr = a;
        int size = 0;
        while(head != null){
            arr[size++] = head.val;
            head = head.next;
        }


        int m  =size/2;
        int maxSum = 0;
        for(int i=0;i<m;i++){
            --size;
            if(arr[i] + arr[size] > maxSum){
                maxSum = arr[i] + arr[size];
            }
        }
        return maxSum;

    }
}