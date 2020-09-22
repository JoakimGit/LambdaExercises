package kea19c.lambda;

@FunctionalInterface
public interface OneArgument<U, T> {

    public U method(T t);
}
