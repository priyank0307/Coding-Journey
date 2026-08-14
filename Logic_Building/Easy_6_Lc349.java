class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();

        for(int n:nums1) set1.add(n);
        for(int n:nums2) set2.add(n);

        set1.retainAll(set2);

        return set1.stream().mapToInt(Integer::intValue).toArray();
    }
}

//stream()->creates a stream of set element
//.mapToInt(Integer::intValue)->from Integer to int value
//toArray->ints to int[]
