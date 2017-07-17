public boolean lastDigit(int a, int b) {
  if(a == b){
    return true;
  }else if(a%10 == b%10){
    return true;
  }else if(a%100 == b%100){
    return true;
  }
  return false;
}
