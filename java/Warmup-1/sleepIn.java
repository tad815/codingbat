public boolean sleepIn(boolean weekday, boolean vacation) {
  if(weekday == true && vacation != true){
    return false;
  } else {
    return true;
  }
}