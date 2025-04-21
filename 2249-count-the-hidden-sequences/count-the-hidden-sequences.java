class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long minPrefix = 0, maxPrefix = 0;
        long sum = 0;

        for (int diff : differences) {
            sum += diff;
            minPrefix = Math.min(minPrefix, sum);
            maxPrefix = Math.max(maxPrefix, sum);
        }

        long minStart = lower - minPrefix;
        long maxStart = upper - maxPrefix;

        if (minStart > maxStart) return 0;

        return (int)(maxStart - minStart + 1);
    }
}
