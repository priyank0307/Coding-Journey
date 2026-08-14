class Solution {
    public int majorityElement(int[] nums) {
        int cnt=0;
        int element=0;

        for(int i=0; i<nums.length; i++){
            if(cnt==0){
                element=nums[i];
            }

            if(nums[i]==element){
                cnt++;
            }else{
                cnt--;
            }
        }
        return element;
    }
}

//Boyer-moore voting algo
