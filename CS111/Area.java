public class Area{
  public static double circleArea(double radius){
    double area = Math.pow(radius, 2) * Math.PI;
    return area;
  }

  public static double ringArea(double radius1, double radius2){
    double area = 0.0;
    if(radius1 > radius2){
      area = circleArea(radius1) - circleArea(radius2);
    }else{
      area = circleArea(radius2) - circleArea(radius1);
    }

    return area;
  }


  public static void main(String[] args){
    System.out.println("Enter first cirle radius: ");
    double radius1 = IO.readDouble();
    System.out.println("Enter second cirle radius: ");
    double radius2 = IO.readDouble();

    double resultArea = ringArea(radius1, radius2);
    System.out.println("The ring area is equivalent to " + resultArea);
  }
}
