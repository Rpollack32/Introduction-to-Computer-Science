public class DonateToPaws{
  public static void main(String [] args){
    double donation = IO.readDouble();
    IO.outputDoubleAnswer(donationFee(donation));
  }

  public static double donationFee(double donationAmount){
    double fee = 0;

    if(donationAmount <= 150){
      fee = 3;
    }else if(donationAmount > 150 && donationAmount < 1500){
      if(donationAmount * .04 >= 8){
        fee = donationAmount * .04;
      }else{
        fee = 8;
      }
    }else if(donationAmount >= 1500 && donationAmount < 15000){
      if(donationAmount * .01 >= 20){
        fee = donationAmount * .01;
      }else{
        fee = 20;
      }
    }else{
      double feeBreakdown = 0;
      feeBreakdown = 15000 * .01;
      donationAmount -= 15000;
      if(donationAmount > 4000){
        feeBreakdown += 4000 * .02;
        donationAmount-= 4000;
        feeBreakdown += donationAmount * .03;
      }else{
        feeBreakdown += donationAmount * .02;
      }
      fee = feeBreakdown;
    }
    return fee;
  }
}
