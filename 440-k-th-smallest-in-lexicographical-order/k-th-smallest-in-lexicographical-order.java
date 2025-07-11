class Solution {
    public int findKthNumber(int n, int k) {
        int current = 1; 
        k--; 
        
        while (k > 0) {
            long steps = countSteps(n, current, current + 1); 
            if (steps <= k) {
                current++;
                k -= steps;
            } else {
                current *= 10;
                k--;
            }
        }
        
        return current;
    }
    
    // Function to count steps between two lexicographical numbers: 'n1' and 'n2'
    private long countSteps(int n, long n1, long n2) {
        long steps = 0;
        while (n1 <= n) {
            steps += Math.min(n + 1, n2) - n1;
            n1 *= 10;
            n2 *= 10;
        }
        return steps;
    }
}
