import java.util.Random;

public class SampleArrayTasks{

  public static void main (String[ ] args ){

    int[] arr = new int[10];
    //using java.util.Random class to generate random integers
    Random randomGenerator = new Random();
    //filling array with random ints [0, 100)
    for (int i = 0; i < arr.length; i++) {
      //assigns a random int value between 0(inclusive) and 100(exclusive)
      arr[i] = randomGenerator.nextInt(100);
    }
    arrayForward(arr);
    System.out.println ( "The smallest value is: " + findSmallest(arr) );
    System.out.println ( "The largest value is: " + findLargest(arr) );
    System.out.println ("The average without large and small is: " + findAvgWithoutLargeAndSmall(arr));
  }


  public static void arrayForward(int[] arr1){
    System.out.println("Array Printed Forward");
    for (int i: arr1){
       System.out.print(" " + i);
    }
    System.out.println();
 }

  public static int findSmallest(int[] a1){
    int small = a1[0];
    for(int elt: a1) {
      if(elt < small) {
        small = elt;
      }
    }
    return small;
  }

  public static int findLargest(int[] a1){
    int large = a1[0];
    for(int elt: a1) {
      if(elt > large) {
        large = elt;
      }
    }
    return large;
  }

  public static double findAvgWithoutLargeAndSmall(int[] a){
    double sum = 0;
    //adding ALL elements in array
    for(int elt: a) {
      sum += elt;
    }
    sum = sum - findLargest(a) - findSmallest(a);
    return sum/(a.length - 2); //finding average
  }
}
