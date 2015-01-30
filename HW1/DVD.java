class DVD extends Media implements Comparable<Media>
{
    private int year;

    public DVD(String title, int year)
    {
        this.title = title;
        this.year = year;
    }

	  public int getYear() 	 { return year;  }

    public String toString()
    {
        return year + ": " + title + " [DVD]";
	  }

    public int compareTo(Media dvd) {
      if(dvd instanceof DVD){
        DVD otherDVD = (DVD) dvd;
        if (this.title.equals(otherDVD.title))
          if(this.year == otherDVD.year)
            return 0;
          else if(this.year > otherDVD.year)
            return 1;
          else
            return -1;
        else if (this.title.compareTo(otherDVD.title) > 0 )
          return 1;
        else
          return -1;
      }
   }
}
