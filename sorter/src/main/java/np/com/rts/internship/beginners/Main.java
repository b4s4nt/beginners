package np.com.rts.internship.beginners;

import java.util.*;


public class Main {

  SimpleThing[] simpleThings = new SimpleThing[] {
          new SimpleThing("hello", 1),
          new SimpleThing("mello", 2),
          new SimpleThing("mell", 3),
          new SimpleThing("1mell", 4),
          new SimpleThing("hmmm", 5),
          new SimpleThing("h2mmm", 6),
          new SimpleThing("zxcvb", 7),
          new SimpleThing("asdf", 8),
          new SimpleThing("%$compli", 9)
  };

  public Main() {

    //System.out.println(simpleThings.length);

    for(int i=0;i<simpleThings.length;i++) {
      //System.out.println(simpleThings[i].nothingSpecial);
      for(int j=i+1; j<simpleThings.length;j++){
        if(simpleThings[i].nothingSpecial.compareTo(simpleThings[j].nothingSpecial)>0){
          SimpleThing tepobj=new SimpleThing(simpleThings[i].nothingSpecial,simpleThings[i].stillNothingSpecial);
          // System.out.println(tepobj.nothingSpecial);
          // System.out.println(simpleThings[i].nothingSpecial);
          simpleThings[i]=new SimpleThing(simpleThings[j].nothingSpecial,simpleThings[j].stillNothingSpecial);
          simpleThings[j]=tepobj;


        }
      }
    }
    for(int k=0; k<simpleThings.length;k++){
      System.out.println(simpleThings[k].nothingSpecial);
      System.out.println(simpleThings[k].stillNothingSpecial);
    }



  }

  public static void main(String[] args) {
    new Main();
  }
}
