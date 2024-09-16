// **************************************************
//   StringPlay.java
//
//   Play with String objects
// **************************************************
package homework;
public class StringPlay
{
   public static void main (String[] args)
   {
      String college = new String ("Leeds Beckett University"); //Similar for part (a)

       // part (a)
      
      String town;
      town="Anytown, UK";
      
      // part (b)
      int stringLength;
      stringLength=college.length();
      
      String change1, change2, change3; 


      System.out.println (college + " contains " + stringLength + " characters.");

      change1 = college.toUpperCase() ; // part (c)

      change2 = change1.toLowerCase().replace("e", "*"); // part (d)

      change3 = change1.concat(town) ; // part (e)

      System.out.println ("The final string is " + change3);
    }
}
