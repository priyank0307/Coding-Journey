class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;

        HashMap<Integer, Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        ArrayList<Integer> keys=new ArrayList<>(map.keySet());

        for(int i=0; i<keys.size(); i++){
            int key=keys.get(i);

            if(map.get(key)>n/3){
                list.add(key);
            }
        }

        return list;
    }
}
