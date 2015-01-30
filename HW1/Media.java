abstract class Media implements Comparable<Media>
{
    protected String title;
	public String getTitle()  { return title; }

  public int compareTo(Media media) {
    //Media otherMedia = (Media) media;
    if (this.title.equals(media.title))
      return 0;
    else if (this.title.compareTo(media.title) > 0)
      return 1;
    else
      return -1;
  }
}
