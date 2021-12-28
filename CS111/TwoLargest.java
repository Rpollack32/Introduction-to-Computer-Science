public class TwoLargest{
  public static void main(String[] args){
    double num1 = 0;
    double num2 = 0;
    double num3 = 0;
    double terminator = IO.readDouble();
    num1 = IO.readDouble();

    while(num1 == terminator){
      IO.reportBadInput();
      num1 = IO.readDouble();
    }

    num2 = IO.readDouble();
    while(num2 == terminator){
      IO.reportBadInput();
      num2 = IO.readDouble();
    }

    if(num2 > num1){
      num3 = num1;
      num1 = num2;
      num2 = num3;
    }

    num3 = IO.readDouble();
    while(num3 != terminator){
      if(num3 > num1){
        if(num1 == num3){
          num1 = num3;
          num2 = num1;
        }else{
          num2 = num1;
          num1 = num3;
        }
      }else if(num3 > num2){
        num2 = num3;
      }

      num3 = IO.readDouble();
    }
    IO.outputDoubleAnswer(num1);
    IO.outputDoubleAnswer(num2);
  }
}
