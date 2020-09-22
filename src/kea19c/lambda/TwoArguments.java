package kea19c.lambda;

@FunctionalInterface
public interface TwoArguments<T> {

    public T process(T a, T b);
}
