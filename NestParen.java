public class Recursion1 {
  public boolean nestParen(String str) {
    if (str.length() == 0){
      return true;
    }
    else {
      if (str.endsWith(")") && str.startsWith("(")){
          return nestParen(str.substring(1, str.length()-1));
        }
        else {
          return false;
        }
      }
  }
}
