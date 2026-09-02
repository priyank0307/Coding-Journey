class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        int pos=Integer.MAX_VALUE;
        for(int i=1; i<=nums.length; i++){
            if(!map.containsKey(i)){
                pos=i;
                break;
            }
        }

        if(pos==Integer.MAX_VALUE){
            pos=nums.length+1;
        }

        return pos;
    }
}

//time complexity:o(n)
//space complexity;o(n)
