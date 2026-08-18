class Solution {
    public int heightChecker(int[] heights) {
        int[] expected=new int[heights.length];

        for(int i=0; i<heights.length; i++){
            expected[i]=heights[i];
        }

        int cnt=0;
        Arrays.sort(expected);

        for(int i=0; i<expected.length; i++){
            if(heights[i]!=expected[i]){
                cnt++;
            }
        }

        return cnt;
    }
}
