package np.com.rts.internship.beginners;

import java.util.*;


public class Main {

  ArrayList<Animal> originalList = new ArrayList<Animal>() {{
    add(new Herbivore("lamb", 4));
    add(new Herbivore("cow", 4));
    add(new Herbivore("giraffe", 4));
    add(new Carnivore("lion", 4));
    add(new Carnivore("bear", 4));
    add(new Carnivore("leopard", 4));
    add(new Carnivore("panther", 4));
    add(new Omnivore("human", 2));
  }};

  ArrayList<Herbivore> herbivores = new ArrayList<>();
  ArrayList<Carnivore> carnivores = new ArrayList<>();
  ArrayList<Omnivore> omnivores = new ArrayList<>();

  public Main() {
    Iterator<Animal> i= originalList.iterator();
    while(i.hasNext()){
      Animal  obj=i.next();

      if( obj instanceof Herbivore ){
        herbivores.add((Herbivore)obj);
      }else if(obj instanceof Carnivore){
        carnivores.add((Carnivore)obj);
      }else if(obj instanceof Omnivore){
        omnivores.add((Omnivore)obj);
      }else{
        System.out.println("Error");
      }



    }

    System.out.print(carnivores.get(0).getName());// this will print name which in inside the first object
    System.out.print(herbivores.size());// this will give the size of object
    System.out.print(omnivores.size());



  }
  public static void main(String[] args) {
    new Main();
  }
}
