public class Student{
  private String fName;
  private String lName;
  private double gpa;
  private int studentID;

    public Student(){
      fName = "John";
      lName = "Doe";
    }

    public Student(String first, String last, int idNumber){
      fName = first;
      lName = last;
      studentID = idNumber;
    }

    public String getName(){
      return fName;
    }

    public void setName(String name){
      fName = name;
    }

    //toString method overrides Object toString
    public String toString(){
      String s = fName + " " + lName + "\t" + "\t" + "studentId = " +
      studentID
     return s;
    }

    public boolean equals (Object obj){
      if(obj instanceof Student){
        //cast statement goes here
        Student s = (Student) obj;
        //code to compare equal state goes here
        boolean result = this.studentID == s.studentID;
        return result;
      }
      else
        return false;
    }
}
