package Java.interfaces;

public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<Integer> obj = (Integer val) -> {
            if (val > 10) {
                System.out.println("login");
            }
        };
        obj.accept(10);
    }
}
