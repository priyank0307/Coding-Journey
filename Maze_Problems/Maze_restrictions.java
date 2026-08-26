public static void main(String[] args){
  boolean[][] maze={
        {true, true, true},
        {true, false, true},
        {true, true, true}
  };
  pathRestrictions("", maze, 0, 0);
}

static void pathRestrictions(String p, boolean maze[][], int r, int c){
  if(r==maze.length-1 && c==maze[0].length-1){
    System.out.println(p);
    return;
  }

  if(!maze[r][c]){
    return;
  }

  if(c<maze[0].length-1){
    pathRestrictions(p+"D", maze, r, c+1);
  }

  if(r<maze.length-1){
    pathRestrictions(p+"R", maze, r+1, c);
  }
}
