public class AppendRec{
  public static String appendNTimes(String original, int n){
    if(n<=0){
      return original;
    }else{
      return original + appendNTimes(original,n-1);
    }
  }

  public static void main(String[] args){
    String str = IO.readString();
    int repititions = IO.readInt();
    appendNTimes(str, repititions);
  }
}
