import java.util.HashMap;
import java.util.Map;

class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> sumCountMap = new HashMap<>();
        
        for (int i = 1; i <= n; i++) {
            int sum = sumOfDigits(i);
            sumCountMap.put(sum, sumCountMap.getOrDefault(sum, 0) + 1);
        }
        
        int maxSize = 0;
        int count = 0;
        
        for (int size : sumCountMap.values()) {
            if (size > maxSize) {
                maxSize = size;
                count = 1;
            } else if (size == maxSize) {
                count++;
            }
        }
        
        return count;
    }
    
    private int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}