public class Factorial{
  public static void main(String[] args){
    int n;
    int product = 1;
    System.out.print("Enter a number: ");
    n = IO.readInt();
    for(int count = n; count > 0; count--){
      product *= count;
    }
    System.out.println("Factorial is " + product);
  }
}
