import java.util.*;

class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int ans : answers) {
            map.put(ans, map.getOrDefault(ans, 0) + 1);
        }
        
        int totalRabbits = 0;
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int k = entry.getKey();      
            int count = entry.getValue();
            int groupSize = k + 1;
            
            int groups = (int)Math.ceil((double)count / groupSize);
            totalRabbits += groups * groupSize;
        }
        
        return totalRabbits;
    }
}
