package kea19c.lambda;

@FunctionalInterface
public interface TwoArguments<x> {

    public x process(x a, x b);
}
