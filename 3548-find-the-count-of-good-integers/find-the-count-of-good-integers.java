class Solution {
    HashSet<String> h = new HashSet<>();
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    int count(long t) {
        char s[] = Long.toString(t).toCharArray();
    
        int n = s.length;

        int cnt[] = new int[10];
        for (char c : s) {
            // if(c-'0'<0)System.out.println(t);
            cnt[c - '0']++;
        }
        String k=Arrays.toString(cnt);
        if(h.contains(k)){
            return 0;
        }
        h.add(k);
        int res = (n - cnt[0]) * factorial(n - 1);
        for (int i : cnt) {
            res /= factorial(i);
        }
        return (int) res;
    }

    public long countGoodIntegers(int n, int k) {
        long res = 0;

        if (n % 2 == 1) {
            for (long i = (int) Math.pow(10, n / 2); i < (int) Math.pow(10, n / 2 + 1); i++) {
                long t = i;
                long temp = i / 10;

                while (temp > 0) {
                    t *= 10;

                    t += temp % 10;
                    temp /= 10;
                }
                if ((t % k) == 0) {
                    res += count(t);
                    // System.out.println(t+" "+count(t));
                  
                }

            }
        } else {
            for (long i = (int) Math.pow(10, n / 2-1); i < (int) Math.pow(10, n / 2); i++) {
                long t = i;
                long temp = i;
                while (temp > 0) {
                    t *= 10;

                    t += temp % 10;
                    temp /= 10;
                }
                if ((t % k) == 0) {
                    // System.out.println(t);
                   res += count(t);
                }

            }
        }

        return res;
    }
}