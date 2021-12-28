public class Song{
  private String name;
  private int year;
  private int numberOfWriters;
  private String writers[];
  private int rating;

  public Song(String name){
    this.name = name;
    numberOfWriters = 0;
    year = 0;
    writers = new String[50];
    rating = 0;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return name;
  }

  public void setYear(int year){
    this.year = year;
  }

  public int getYear(){
    return year;
  }

  public void setRating(int rating){
    this.rating = rating;
  }

  public int getRating(){
    return rating;
  }

  public void addWriter(String writer){
    if(numberOfWriters < 50)
     this.writers[numberOfWriters++] = writer;
  }

  public String[] getWriters(){
    return writers;
  }

  public int getNumberOfWriters(){
    return numberOfWriters;
  }

  public String getWriterAtIndex(int index){
    if(index >= numberOfWriters){
      return null;
    }
    else{
      return writers[index];
    }
  }

  public String toString(){
      String details = name + ", "+ year +", " + rating;
      return details;
  }

  public boolean equals(Song other){
    if((name.equals(other.name) && (year == other.year) && (numberOfWriters == other.numberOfWriters))){
      for(int i = 0; i < numberOfWriters; i++){
        boolean same = false;
        for(int j = 0; j < numberOfWriters; j++){
          if(writers[i].equals(other.writers[j])){
            same = true;
            break;
          }
        }
        if(same == false){
          return false;
        }
      }
      return true;
    }
    else{
      return false;
    }
  }

  public int compareTo(Song other){
    return name.compareTo(other.name);
  }
}
