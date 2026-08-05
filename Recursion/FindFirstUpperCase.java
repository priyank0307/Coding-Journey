public static void main(String[] args){
  String str="geeksforgeeKs";
  FirstUpper(str, 0);
}

static void FirstUpper(String str, int index){

  if(index==str.length()-1){
    system.out.println(-1);
    return;
  }

  char ch=str.chatAt(index);
  if(Character.isUpperCase(ch)){
    system.out.println(ch);
    return;
  }else{
    FirstUpper(str, index+1);
  }
}
