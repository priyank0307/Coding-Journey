class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> outer=new ArrayList<>();
        ArrayList<Integer> p=new ArrayList<>();
        ArrayList<Integer> up=new ArrayList<>();

        for(int num: candidates) up.add(num);

        backtrack(p, up, outer, target, 0, 0);

        return outer;
    }

    private static void backtrack(ArrayList<Integer> p, ArrayList<Integer> up, List<List<Integer>> outer, int target, int sum, int index){
        if(sum==target){
            outer.add(new ArrayList<>(p));
            return;
        }

        if(sum>target) return;

        for(int i=index; i<up.size(); i++){
            int num=up.get(i);
            p.add(num);
            backtrack(p, up, outer, target, sum+num, i);
            p.remove(p.size()-1);
        }
    }
}
