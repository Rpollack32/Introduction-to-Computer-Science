public class StudentTester{
  public static void main(String[] args){
    Student s1 = new Student();
    System.out.println(s1);

    System.out.println("First Name?");
    String firstName = IO.readString();
    System.out.println("Last Name?");
    String lastName = IO.readString();
    System.out.println("Id?");
    int id = IO.readInt();

    Student s2 = new Student(firstName, lastName, id);

    System.out.println(s1.getName());
    //s1.setName("Paul");
    System.out.println(s2.getName());
  }

  public static void main(String[] args){
    Student s1 = new Student();
    if(s1 instanceof Object)
      System.out.println("s1 is instance of Object");
    else
      System.out.println("s1 is NOT instance of Student");
    //System.out.println(s1);

    Student s3 = new Student("John", "Doe", 001);

    //s1 = s3;
    //equals
    if(s3.equals(s1)){
      System.out.println("Same Objects!");
      System.out.println(s1);
      System.out.println(s3);
    }else{
      System.out.println("Different Objects");
      System.out.println(s1);
      System.out.println(s3);
    }
  }
}
