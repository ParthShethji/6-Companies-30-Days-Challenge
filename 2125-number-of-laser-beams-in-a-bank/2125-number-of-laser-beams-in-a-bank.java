class Solution {
    public int numberOfBeams(String[] bank) {
        int n = bank[0].length();
        int m = bank.length;
        int curr = 0, prev = 0, ans = 0;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (bank[i].charAt(j) == '1') {
                    curr++;
                }
            }
            
            if (curr != 0) {
                int laser = prev*curr;
                ans += laser;
                prev = curr;
                curr = 0;
            }
        }
        
        return ans;
    }
}
