class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] res=new int[2*n];

        int index=0;

        for(int i=0; i<2*n; i++){
            res[index]=nums[i%n];
            index++;
        }

        return res;
    }
}
