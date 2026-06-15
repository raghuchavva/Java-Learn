package Java.inheritance;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
//        Animal [] animals = new Animal[3]; // Hold array objects of type animal        animals[0] = new Cat();
//        animals[0] = new Lion();
//        animals[1] = new Cat();
//        animals[2] = new Cat();
//        Animal previous = null;
//        for(Animal animal: animals){
//            animal.eat();
//            animal.sleep();
//            System.out.println(animal.getClass());
//            System.out.println(animal.hashCode());
//            System.out.println(animal.toString());
//            if(previous!=null) {
//                System.out.println(animal.equals(animal == previous));
//            }
//            previous = animal;
//        }

        ArrayList<Cat> myCatArrayList = new ArrayList<Cat>();
        Cat aCat = new Cat();
        myCatArrayList.add(aCat);



    }
}
