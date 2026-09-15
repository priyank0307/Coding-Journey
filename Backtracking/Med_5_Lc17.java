class Solution {
    public List<String> letterCombinations(String digits) {  
        List<String> result=new ArrayList<>();
        if(digits==null || digits.length()==0){
            return result;
        }

        String[] mapping={
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };

        StringBuilder current=new StringBuilder();
        backtrack(digits, 0, current, mapping, result);
        return result;
    }

    private static void backtrack(String digits, int index, StringBuilder current, String[] mapping, List<String> result){
        //base case:built a combination for every digits
        if(index==digits.length()){
            result.add(current.toString());
            return;
        }

        int digit=digits.charAt(index)-'0';
        String letters=mapping[digit];

        for(char letter: letters.toCharArray()){
            current.append(letter);
            backtrack(digits, index+1, current, mapping, result);
            //backtrack
            current.deleteCharAt(current.length()-1);
        }
    }
}
