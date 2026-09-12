class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> outer=new ArrayList<>();
        ArrayList<Integer> p=new ArrayList<>();
        ArrayList<Integer> up=new ArrayList<>();

        for(int num: candidates) up.add(num);

        backtrack(p, up, outer, target, 0, 0);

        return outer;
    }

     private static void backtrack(ArrayList<Integer> p, ArrayList<Integer> up, List<List<Integer>> outer, int target, int sum, int index){
        if(sum==target){
            ArrayList<Integer> list=new ArrayList<>(p);
            Collections.sort(list);
            if(!outer.contains(list)){
                outer.add(new ArrayList<>(list));
            }
            return;
        }

        if(sum>target) return;

        for(int i=index; i<up.size(); i++){
            int num=up.get(i);
            p.add(num);
            backtrack(p, up, outer, target, sum+num, i+1);
            p.remove(p.size()-1);
        }
    }
}

//not optimal
