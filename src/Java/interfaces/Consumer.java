package Java.interfaces;

@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}
