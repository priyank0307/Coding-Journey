class Solution {   
    public boolean exist(char[][] board, String word) {
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(validation(board, word, i, j, 0)){
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean validation(char[][] board, String word, int row, int col, int index){
        //whole word matched
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
        //marking visited
        board[row][col]='#';  

        boolean found=validation(board, word, row-1, col, index+1)
                    || validation(board, word, row+1, col, index+1)
                    || validation(board, word, row, col-1, index+1)
                    || validation(board, word, row, col+1, index+1);

        //unmarking or backtrack
        board[row][col]=temp;            
    return found;
    }

    static boolean isValid(char[][] board, int row, int col){
        if(row>=0 && row<board.length && col>=0 && col<board[0].length){
            return true;
        }
        return false;
    }
}
