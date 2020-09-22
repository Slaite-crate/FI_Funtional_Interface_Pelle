package dk.kea;

@FunctionalInterface
public interface TwoArguments<T, U> {
    Integer test(T t, U u);
}
