public boolean posNeg(int a, int b, boolean negative) {
  if((a<0 && b>0) && !negative){
    return true;
  }
  if((a>0 && b<0) && !negative){
    return true;
  }
  if((a<0 && b<0) && negative){
    return true;
  }
  return false;
}
