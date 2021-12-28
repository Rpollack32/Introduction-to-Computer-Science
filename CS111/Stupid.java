public class Stupid{
  public static void main(String[] args){
    //"coyyoos"
    String str = IO.readString();
    int count = 0;
    int totalCount = 0;

    for(int i = 0; i < str.length(); i++){
      for(int j = i+1; j < str.length(); j++){
        if(count == 0 && str.charAt(i) == str.charAt(j)){
          count++;
          totalCount += 2;
        }else if(str.charAt(i) == str.charAt(j)){
          totalCount++;
        }
      }
      count = 0;
    }

    System.out.println(totalCount);
  }
}
