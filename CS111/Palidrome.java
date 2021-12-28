public class Palidrome{
  public static void main(String[] args){
    System.out.println("Type word: ");
    System.out.println(checkPalidrome(IO.readString()));
  }

  public static boolean checkPalidrome(String word){
    return word.equals(reverse(word));
  }

  public static String reverse(String s){
    String reversed = "";
    for(int i = s.length() - 1; i >= 0; i--){
      reversed = reversed + s.charAt(i);
    }
    return reversed;
  }
}
