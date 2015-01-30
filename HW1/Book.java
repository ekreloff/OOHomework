/* Book.java
* Modified by Ethan Kreloff on January 30th, 2015
*/

class Book extends Media implements Comparable<Media>
{
    private String author;
    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
    }
	  public String getAuthor() { return author; }

    public String toString()
    {
        return getTitle() + " by " + getAuthor();
	  }

    public int compareTo(Media book) {
      if(book instanceof Book){
        Book otherBook = (Book) book;
        if (this.title.equals(otherBook.title))
          if(this.author.equals(otherBook.author))
            return 0;
          else if(this.author.compareTo(otherBook.author) > 0)
            return 1;
          else
            return -1;
        else if (this.title.compareTo(otherBook.title) > 0)
          return 1;
        else
          return -1;
      }

      if(book instanceof DVD){
        return 1;
      }

      return 0;
   }
}
