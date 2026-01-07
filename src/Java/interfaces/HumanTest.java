package Java.interfaces;

public class HumanTest{
    public static void main(String[] args){
          Human obj =new Human(){ //Even though interfaces cannot be instantiated, Java allows creating objects of anonymous classes or lambda implementations of functional interfaces.
              @Override
              public void run(){
                  System.out.println("Running");
              }
          };

          //lambda expression
         Human obj1=()->System.out.println("Running");
         obj1.run();
    }
}
