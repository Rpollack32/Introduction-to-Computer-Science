public class Play{
  public static void main(String[] args){
      System.out.println("\nIs Spanish music good? ");
      String answer = IO.readString();
      if(answer.equals("No"))
        System.out.println("\nCorrect.");
      else
        System.out.println("\nWrong.");

      System.out.println("\n\n\n\n\n");
  }
}
