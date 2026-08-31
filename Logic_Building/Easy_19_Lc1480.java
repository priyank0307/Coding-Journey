class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int evenSize=(nums.length+1)/2;
        int oddSize=(nums.length)/2;

        int[] even=new int[evenSize];
        int[] odd=new int[oddSize];

        int e=0;
        int o=0;

        for(int i=0; i<nums.length; i++){
            if(i%2==0){
                even[e++]=nums[i];
            }else{
                odd[o++]=nums[i];
            }
        }

        Arrays.sort(even);
        Arrays.sort(odd);

        e=0;
        o=odd.length-1;

        for(int i=0; i<nums.length; i++){
            if(i%2==0){
                nums[i]=even[e++];
            }else{
                nums[i]=odd[o--];
            }
        }

        return nums;
    }
}
