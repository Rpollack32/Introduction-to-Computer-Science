public class Duplicate{
  public static void main(String[] args){
    int x = IO.readInt();
    int y = IO.readInt();
    int z = IO.readInt();
    if(x==y)
      IO.outputStringAnswer("TRUE");
    else if(y==x)
      IO.outputStringAnswer("TRUE");
    else if(x==z)
      IO.outputStringAnswer("TRUE");
    else
      IO.outputStringAnswer("FALSE");


  }
}
