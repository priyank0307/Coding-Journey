class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outer=new ArrayList<>();

        backtrack(nums, 0, new ArrayList<>(), outer);

        return outer;
    }

    private static void backtrack(int[] nums, int index, List<Integer> curr, List<List<Integer>> outer){
        if(index==nums.length){
            outer.add(new ArrayList<>(curr));
            return;
        }

        //include current element
        curr.add(nums[index]);
        backtrack(nums, index+1, curr, outer);

        //exclude current element
        curr.remove(curr.size()-1);
        backtrack(nums, index+1, curr, outer);
    }

}
