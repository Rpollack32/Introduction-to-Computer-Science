public class NumberOfDigits{
  public static void main(String[] args){
    int digits = 0;

    System.out.print("Enter an integer: ");
    int number = IO.readInt();

    while(number > 0){
      digits += 1;
      number /= 10;
    }
    
    IO.outputIntAnswer(digits);
  }
}
