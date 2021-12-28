public class BuyingApples{
  public static void main(String[] args){
    double totalCost = 0;

    System.out.print("Enter cost per LB: ");
    double pounds = IO.readDouble();
    System.out.print("Enter number of pounds: ");
    double cost = IO.readDouble();

    if(pounds < 0 || cost < 0){
      IO.reportBadInput();
    }else{
      totalCost = pounds * cost;
      IO.outputDoubleAnswer(totalCost);
    }
  }
}
