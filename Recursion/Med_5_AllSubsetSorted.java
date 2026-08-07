public static void main(String[] args){
  ArrayList<String> ans=allSubset("", "abc");
  Collections.sort(ans);
  System.out.println(ans);
}

static ArrayList<String> allSubset(String p, String up){
  if(up.equals("")){
    ArrayList<String> list=new ArrayList<>();
    list.add(p);
  }

char ch=up.charAt(0);
ArrayList<String> first=allSubset(p+ch, up.subString(1));
ArrayList<String> first=allSubset(p, up.subString(1));  
first.addAll(second);
first.remove(String::isEmpty);
return first;
}
