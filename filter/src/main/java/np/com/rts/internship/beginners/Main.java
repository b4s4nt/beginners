package np.com.rts.internship.beginners;

import java.util.*;


public class Main {

  ArrayList<Animal> originalList = new ArrayList<Animal>() {{
    add(new Animal("herbivore", "lamb", 4));
    add(new Animal("herbivore", "cow", 4));
    add(new Animal("herbivore", "giraffe", 4));
    add(new Animal("carnivore", "lion", 4));
    add(new Animal("carnivore", "bear", 4));
    add(new Animal("carnivore", "leopard", 4));
    add(new Animal("carnivore", "panther", 4));
    add(new Animal("omnivore", "human", 2));
  }};
;
  ArrayList<Animal> herbivores = new ArrayList<>();
  ArrayList<Animal> carnivores = new ArrayList<>();
  ArrayList<Animal> omnivores = new ArrayList<>();

  public Main() {
    Iterator<Animal> i=originalList.iterator();
    while (i.hasNext()) {
      Animal obj=i.next();
     // System.out.println(i.next().getType());

      if(obj.getType().equalsIgnoreCase("herbivore")){
        herbivores.add(obj);


      } else if (obj.getType().equalsIgnoreCase("omnivore")){
        omnivores.add(obj);


      } else{
        carnivores.add(obj);

      }





    }
    // Write your code here


  }
  public static void main(String[] args) {
    new Main();
  }
}
