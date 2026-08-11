class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] sort=new int[nums.length];

        int index=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
                sort[index]=nums[i];
                index+=2;
            }
        }

        int index2=1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2!=0){
                sort[index2]=nums[i];
                index2+=2;
            }
        }

        return sort;
    }
}
