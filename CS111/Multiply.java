public class Multiply{
  public static void main(String[] args){
    System.out.print("Enter number: ");
    int num1 = IO.readInt();
    System.out.print("Enter number: ");
    int num2 = IO.readInt();
    int product = num1 * num2;
    IO.outputIntAnswer(product);
  }
}
