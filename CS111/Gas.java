public class Gas{
  public static void main(String[] args){
    double totalCost = 0;

    System.out.print("Enter cost of gallon of gas: ");
    double gallonCost = IO.readDouble();
    System.out.print("Enter number of gallons: ");
    double gallonAmount = IO.readDouble();
    System.out.print("Is customer paying with a credit card? ");
    boolean payWithCreditCard = IO.readBoolean();

    if(gallonCost < 0 || gallonAmount < 0){
      IO.reportBadInput();
    }else if(payWithCreditCard == true){
      totalCost = gallonCost * gallonAmount * 1.1;
      IO.outputDoubleAnswer(totalCost);
    }else{
      totalCost = gallonCost * gallonAmount;
      IO.outputDoubleAnswer(totalCost);
    }
  }
}
