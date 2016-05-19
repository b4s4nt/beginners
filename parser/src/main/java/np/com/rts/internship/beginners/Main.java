package np.com.rts.internship.beginners;

import java.util.*;


public class Main {

  private String parseThis = "20160519150000-STX,6-3.0-CONF4";

  // Parsed value must be inserted into this variable
  double value;

  public Main() {
    char a=0;
    char b=0;
    char c=0 ;

    // Write your code here
    for(int i=0;i< parseThis.length();i++){
      char a_char = parseThis.charAt(i);
      //System.out.println(a_char);

      if(i==21){
       // System.out.println(a_char);
         a=a_char;

      }
      if(i==22){
        //System.out.println(a_char);
         b=a_char;
       // System.out.println(b);


      }
      if(i==23){
        //System.out.println(a_char);
         c= a_char;

      }

      }





   // String fromCharArray = new String(new char[]{x});
    //char c = 'a';
   // String s = String.valueOf(c);             // fastest + memory efficient
    String s1 = Character.toString(a);
    String s2 = Character.toString(b);
    String s3 = Character.toString(c);
    String s=s1+s2+s3;




    value =Double.parseDouble(s);
    //System.out.println(vlaue);
    System.out.println(value);

   //value=s;

  }




  public static void main(String[] args) {
    new Main();
  }
}
