class Solution {
    public List<List<String>> partition(String s) {  
        List<List<String>> outer=new ArrayList<>();

        backtrack(new ArrayList<>(), s, outer, 0);

        return outer;
    }

    private static void backtrack(List<String> p, String s, List<List<String>> outer, int index){
        if(index==s.length()){
            outer.add(new ArrayList<>(p));
            return;
        }

        for(int i=index; i<s.length(); i++){
            String str=s.substring(index, i+1);
            if(isPalin(str)){
                p.add(str);
                backtrack(p, s, outer, i+1);
                p.remove(p.size()-1);
            }
        }
    }

    private static boolean isPalin(String str){
        int first=0; 
        int last=str.length()-1;

        while(first<=last){
            if(str.charAt(first)!=str.charAt(last)){
                return false;
            }
            first++;
            last--;
        }

        return true;
    }
}
