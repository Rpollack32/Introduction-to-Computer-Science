public class Compress{
  public static String compress(String compressedText){
    int length = 1;

    if (compressedText.length() <= 1)
      return compressedText;

    while (length < compressedText.length() && compressedText.charAt(0) == compressedText.charAt(length)){
        length++;
    }

    String lengthString = "";
      if(length > 1){
        lengthString = String.valueOf(length);
      }else{
        lengthString = "";
      };

    return lengthString + compressedText.substring(0,1) + compress(compressedText.substring(length));
  }

  public static void main(String[] args){
    String str = IO.readString();
    System.out.println(compress(str));
  }
}
