int countXX(String str) {
  int num = 0;
  for(int i = 0; i < str.length()-1; i++){
    if(str.charAt(i) == 'x' && str.charAt(i+1) == 'x'){
      num++;
    }
  }
  return num;
}
