static int[] sortArray(int[] nums){
  int left=0;

for(int right=0; right<nums.length; roght++){
  if(nums[right]%2==0){
    int temp=nums[left];
    nums[left]=nums[right];
    nums[right]=temp;
    left++;
  }
}
  return nums;
}

//
Input: nums = [3,1,2,4]
Output: [2,4,3,1]
