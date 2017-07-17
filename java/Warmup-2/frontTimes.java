public String frontTimes(String str, int n) {
  String str2 = "";
  for(int i = 0; i<n; i++){
    if(str.length()<3){
      str2 = str2 + str;
    }else{
      str2 = str.substring(0,3) + str2;
    }
  }
  return str2;
}
