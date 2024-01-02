class Solution {
    public int minimizeSet(int D1, int D2, int C1, int C2) {
        long lcm = lcm(D1, D2);
        
        int start = C1 + C2;
        int end = Integer.MAX_VALUE;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (isValid(mid, D1, D2, C1, C2, lcm)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    private boolean isValid(int mid, int D1, int D2, int C1, int C2, long lcm) {
        return (mid - mid / D1) >= C1 && (mid - mid / D2) >= C2 && (mid - mid / lcm) >= (C1 + C2);
    }

    private long lcm(int a, int b) {
        return (a / gcd(a, b)) * (long) b;  
    }

    private int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }
}