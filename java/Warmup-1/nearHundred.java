public boolean nearHundred(int n) {
  if(Math.abs(n-100) < 11){
    return true;
  }
  if(Math.abs(n-200) < 11){
    return true;
  }
  return false;
}