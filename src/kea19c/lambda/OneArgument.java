package kea19c.lambda;

import java.util.List;

@FunctionalInterface
public interface OneArgument<T> {

    public T method(List<String> t);
}
