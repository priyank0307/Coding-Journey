static ArrayList<String> path(String p, int r, int c){
  if(r==1 && c==1){
    ArrayList<String> list=new ArrayList<>();
    list.add(p);
    return p;
  }

  ArrayList<String> list1=new ArrayList<>();

  if(c>1){
    ArrayList<String> left=path(p+"D", r, c-1);
    list1.addAll(left);
  }

  if(r>1){
    ArrayList<String> left=path(p+"R", r-1, c);
    list1.addAll(right);
  }

return list1;
}
