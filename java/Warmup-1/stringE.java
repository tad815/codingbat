public boolean stringE(String str) {
  int num = 0;
  for(int i = 0; str.length()>i; i++){
    if(str.substring(i,i+1).equals("e")){
      num++;
    }
  }
  if(num>0 && num<4){
    return true;
  }
  return false;
}
