public class Zoo{
  public static void main(String[] args){
    int totalGiraffes = 0;
    int totalLions = 0;
    int totalSnakes = 0;

    System.out.print("Enter number of zoos: ");
    int zoos = IO.readInt();

    while(zoos > 0){
      System.out.print("Enter number of giraffes for zoo: ");
      int giraffes = IO.readInt();
      System.out.print("Enter number of lions for zoo: ");
      int lions = IO.readInt();
      System.out.print("Enter number of snakes for zoo: ");
      int snakes = IO.readInt();
      totalGiraffes += giraffes;
      totalLions += lions;
      totalSnakes += snakes;
      zoos--;
    }

    IO.outputIntAnswer(totalGiraffes);
    IO.outputIntAnswer(totalLions);
    IO.outputIntAnswer(totalSnakes);
  }
}
