public int max1020(int a, int b) {
  if((a>9 && a<21) && (b>9 && b<21)){
    if(a>b){
      return a;
    }else{
      return b;
    }
  }else if((a>9 && a<21) && !(b>9 && b<21)){
    return a;
  }else if(!(a>9 && a<21) && (b>9 && b<21)){
    return b;
  }
  return 0;
}