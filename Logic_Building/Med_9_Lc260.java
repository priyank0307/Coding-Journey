class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int[] unique=new int[2];

        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        int index=0; 
        for(Integer key:map.keySet()){
            if(map.get(key)==1){
                unique[index++]=key;
            }
        }
        return unique;
    }
}

//not optimal
