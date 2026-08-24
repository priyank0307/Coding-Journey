public static void main(String[] args){
  path("", 3, 3);
}

static void path(String p, int r, int c){
  if(r==1 || c==1){
    System.out.println(p);
    return;
  }

  if(c>1){
    path(p+"D", r, c-1);
  }

  if(r>1){
    path(p+"R", r-1, c);
  }
}

//output : 
DDRR
DRDR
DRRD
RDDR
RDRD
RRDD  
