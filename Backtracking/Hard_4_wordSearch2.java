class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        List<String> list=new ArrayList<>();

        for(int i=0; i<words.length; i++){
            String word=words[i];
            outer:
            for(int j=0; j<board.length; j++){
                for(int k=0; k<board[0].length; k++){
                    if(validation(board, word, j, k, 0)){
                        list.add(word);
                        break outer;
                    }
                }
            }
        }

        return list;
    }

    private static boolean validation(char[][] board, String word, int row, int col, int index){

        if(index==word.length()){
            return true;
        }

        if(!isValid(board, row, col)){
            return false;
        }

        if(board[row][col]!=word.charAt(index)){
            return false;
        }

        char temp=board[row][col];
        board[row][col]='#';

        boolean found=validation(board, word, row-1, col, index+1)
                    || validation(board, word, row+1, col, index+1)
                    || validation(board, word, row, col-1, index+1)
                    || validation(board, word, row, col+1, index+1);

        //backtrack
        board[row][col]=temp;

        return found;            
    }

    private static boolean isValid(char[][] board, int row, int col){
        if(row>=0 && row<board.length && col>=0 && col<board[0].length){
            return true;
        }
        return false;
    }
}


//not optimal
//TLE issue
