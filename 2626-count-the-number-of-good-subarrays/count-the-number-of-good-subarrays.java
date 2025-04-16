import java.util.*;

public class Solution {

    public long countGood(int[] arr, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int n = arr.length;
        long result = 0;
        int left = 0;
        long pairs = 0;

        for (int right = 0; right < n; right++) {
            int val = arr[right];
            int freq = freqMap.getOrDefault(val, 0);
            pairs += freq; 
            freqMap.put(val, freq + 1);

            while (pairs >= k) {
                result += (n - right);
                int leftVal = arr[left];
                int leftFreq = freqMap.get(leftVal);
                freqMap.put(leftVal, leftFreq - 1);
                pairs -= (leftFreq - 1); 
                left++;
            }
        }

        return result;
    }

}
