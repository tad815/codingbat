public String everyNth(String str, int n) {
  String str2 = "";
  int num = 0;
  while(num<str.length()){
    str2 = str2 + str.substring(num, num+1);
    num = num + n;
  }
  return str2;
}