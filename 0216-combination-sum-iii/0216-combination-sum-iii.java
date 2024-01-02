class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(1, k, n, new ArrayList<>(), ans);
        return ans;
    }
    
    public void backtrack(int start, int k, int n, List<Integer> curr, List<List<Integer>> ans){
        if(n<0) return;
        if(curr.size()==k){
            if(n==0){
                ans.add(new ArrayList<>(curr));
            }
            return;
        }
        for(int i=start; i<=9; i++){
            curr.add(i);
            backtrack(i+1, k, n-i, curr, ans);
            curr.remove(curr.size()-1);
        }
    }
}

