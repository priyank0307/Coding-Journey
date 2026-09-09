class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> outer=new ArrayList<>();
        ArrayList<Integer> p=new ArrayList<>();
        ArrayList<Integer> up=new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            up.add(nums[i]);
        }

        permutations(p, up, outer);

        return outer;
    }

    private static void permutations(ArrayList<Integer> p, ArrayList<Integer> up, List<List<Integer>> outer){
        if(up.isEmpty()){
            outer.add(new ArrayList<>(p));
            return;
        }

        for(int i=0; i<up.size(); i++){
            int num=up.remove(i);
            p.add(num);
            permutations(p, up, outer);

            //backtrack
            p.remove(p.size()-1);
            up.add(i, num);
        }
    } 
}
