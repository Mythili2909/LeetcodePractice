class Solution {
    private static final int MOD = 1337;

    public int superPow(int a, int[] b) {
        int result = 1;
        for (int digit : b) {
            result = (powMod(result, 10) * powMod(a, digit)) % MOD;
        }
        return result;
    }

    private int powMod(int a, int k) {
        a %= MOD;
        int res = 1;
        for (int i = 0; i < k; i++) {
            res = (res * a) % MOD;
        }
        return res;
    }
}
