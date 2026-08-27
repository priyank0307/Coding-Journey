class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();

        for(int n:nums1) set1.add(n);
        for(int n:nums2) set2.add(n);

        int ans1=0;
        int ans2=0;

        for(int n:nums1){
            if(set2.contains(n)){
                ans1++;
            }
        }

        for(int n:nums2){
            if(set1.contains(n)){
                ans2++;
            }
        }

        return new int[]{ans1, ans2};
    }
}
