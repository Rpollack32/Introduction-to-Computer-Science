public class Fibonacci{
  public static int fib(int n){
    if(n == 1 || n == 2){
      return 1;
    }else{
      return fib(n - 1) + fib(n - 2);
    }
  }

  public static void main(String[] args){
    System.out.println("n-th the number of the sequence?");
    int n = IO.readInt();
    System.out.println("Result: " + fib(n));
  }
}
