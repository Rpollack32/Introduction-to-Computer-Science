public class TempConverter{
  public static void main(String[] args){
    double farenheit;
    double celcius;

    System.out.println("Enter temp in farenheit: ");
    farenheit = IO.readDouble();

    if(farenheit < -457.67){
      IO.reportBadInput();
    }else{
      celcius = (farenheit - 32) * 5/9;
      IO.outputDoubleAnswer(celcius);
    }
  }
}
