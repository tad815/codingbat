public String stringSplosion(String str) {
  String str2 = "";
  for(int i = 0; i<str.length()+1; i++){
    str2 = str2 + str.substring(0,i);
  }
  return str2;
}