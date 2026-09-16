class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Integer>[] rows=new HashSet[9];
        HashSet<Integer>[] col=new HashSet[9];
        HashSet<Integer>[] boxes=new HashSet[9];

        for(int i=0; i<9; i++){
            rows[i]=new HashSet<>();
            col[i]=new HashSet<>();
            boxes[i]=new HashSet<>();
        }

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                int num=board[i][j]-'0';
                if(board[i][j]=='.'){
                    continue;
                }

                int box=(i/3)*3+j/3;
                if(rows[i].contains(num) || col[j].contains(num) || boxes[box].contains(num)){
                    return false;
                }

                rows[i].add(num);
                col[j].add(num);
                boxes[box].add(num);
            }
        }

        return true;
    }
}
