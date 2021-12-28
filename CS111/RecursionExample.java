public class RecursionExample{
  public static void main(String[] args){
    p(0);
  }

  public static void p(int n){
    n++;
    if(n <= 5){
      System.out.println("Hello World " + n);
      p(n + 1);
    }
  }
}
