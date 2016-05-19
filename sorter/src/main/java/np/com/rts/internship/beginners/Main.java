package np.com.rts.internship.beginners;

import java.util.*;


public class Main {

  String[] strings = new String[] {
          "hello",
          "mello",
          "mell",
          "1mell",
          "hmmm",
          "h2mmm",
          "zxcvb",
          "asdf",
          "%$compli"
  };

  public Main() {

    for (int j = 0; j < strings.length; j++) {
      for (int i = j + 1; i < strings.length; i++) {
        if (strings[i].compareTo(strings[j]) < 0) {
          String temp = strings[j];
          strings[j] = strings[i];
          strings[i] = temp;
         // System.out.println(strings[i]);
        }
       // System.out.println(strings[j]);


      }


      }
    for (int k=0;k<strings.length;k++){
      System.out.println(strings[k]);

    }



      // Write your code here



  }

  public static void main(String[] args) {
    new Main();
  }
}
