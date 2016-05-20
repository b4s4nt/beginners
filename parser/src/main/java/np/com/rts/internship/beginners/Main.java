package np.com.rts.internship.beginners;

import java.io.UnsupportedEncodingException;
import java.util.*;


public class Main {

  private String parseThis = "3127162:261111\n" +
          "TUY-7.4/1\n" +
          "DPOG5";

  // Parsed value must be inserted into this variable
  double value;

  public Main() {
    char a=0;
    char b=0;
    char c=0;
    String s=" ";


    try {

      byte[] bytes = parseThis.getBytes("US-ASCII");
      for(int i=0;i<parseThis.length();i++){
        // System.out.print(bytes[i]-1);
        char e=  (char) (bytes[i]-1);
        s=  s+e;// this is concatination of each character corrresponds to each bytes or ascii
        //System.out.println(s);
        //s.replace("null", "");
        //System.out.println(s);

      }

    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    }


    // System.out.println(s);

    // Write your code here
    for(int i=0;i< s.length();i++){
      char a_char = s.charAt(i);


      if(i==21){
        a=a_char;

      }
      if(i==22){

        b=a_char;



      }
      if(i==23){

        c= a_char;

      }

    }








    String s1 = Character.toString(a);
    String s2 = Character.toString(b);
    String s3 = Character.toString(c);
    String s4=s2+s3;// this is give 3.0 as string value




    value =Double.parseDouble(s4); //converting string to double

    System.out.println(value);







  }


  public static void main(String[] args) {
    new Main();
  }
}
