/* UserUtility.java
 * Created by Ethan Kreloff on January 30th, 2015
 */

public class UserUtility
{
   static String createUsername(String firstName, String lastName){
      return firstName.substring(0,3) + lastName.substring(lastName.length() - 3, lastName.length());
   }
}
