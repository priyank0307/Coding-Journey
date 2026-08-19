//too much time and space complexity: 2^n

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> outer=new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int i=0; i<nums.length; i++){
            int n=outer.size();
            for(int j=0; j<n; j++){
                List<Integer> internal=new ArrayList<>(outer.get(j));
                internal.add(nums[i]);

                outer.add(internal);
            }
        }

        for(int i=outer.size()-1; i>=0; i--){
            int sum=0; 
            for(int j=0; j<outer.get(i).size(); j++){
                sum+=outer.get(i).get(j);
            }

            if(sum!=0 || outer.get(i).size()!=3){
                outer.remove(i);
            }
        }

        Set<List<Integer>> set=new HashSet<>();

        for(int i=0; i<outer.size(); i++){
            Collections.sort(outer.get(i));
            set.add(outer.get(i));
        }

        outer=new ArrayList<>(set);
        return outer;
    }
}
