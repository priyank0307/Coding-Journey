class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> outer=new ArrayList<>();
        Arrays.sort(candidates);

        backtrack(new ArrayList<>(), candidates, outer, target, 0, 0);

        return outer;
    }

     private static void backtrack(List<Integer> p, int[] candidates, List<List<Integer>> outer, int target, int sum, int index){
        if(sum==target){
            outer.add(new ArrayList<>(p));
            return;
        }

        if(sum>target) return;

        for(int i=index; i<candidates.length; i++){
            if(i>index && candidates[i]==candidates[i-1]) continue;

            p.add(candidates[i]);
            backtrack(p, candidates, outer, target, sum+candidates[i], i+1);
            p.remove(p.size()-1);
        }
    }
}
