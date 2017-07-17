public String endUp(String str) {
  String str2;
  if(str.length()<3){
    str2 = str.toUpperCase();
    return str2;
  }else{
    str2 = str.toUpperCase();
    return str.substring(0, str.length()-3) + str2.substring(str.length()-3);
  }
}
