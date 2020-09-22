package kea19c.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // Generic two argument interface. Here it adds two ints.
        TwoArguments<Integer> sum = (a, b) -> (a + b);
        System.out.println("Result of adding 10 and 20: " + sum.process(10, 20));
        // Same interface, but here it concatenates two strings.
        TwoArguments<String> concat = (a, b) -> (a + " " + b);
        System.out.println("Result of adding 'Hello' and 'World': " + concat.process("Hello", "World"));

        // Generic one argument interface. Here it converts a list of string numbers to a list of integers.
        List<String> myStrings = Arrays.asList("1", "2", "3", "4", "5");
        OneArgument<List<Integer>> intList = li -> li.stream().map(Integer::valueOf).collect(Collectors.toList());
        List<Integer> myInts = intList.method(myStrings);

        System.out.println("Adding 1 and 2 from string list: " + (myStrings.get(0) + myStrings.get(1)));
        System.out.println("Adding 1 and 2 from int list: " + (myInts.get(0) + myInts.get(1)));

        // Zero argument interface.
        ZeroArguments hello = () -> System.out.println("Hello");
        hello.greeting();

        /*List<Movie> myMovies = new ArrayList<>();
        myMovies.add(new Movie("Joker", 867155, 2019, 122));
        myMovies.add(new Movie("Inception", 2012028, 2010, 148));
        myMovies.add(new Movie("The Devil All The Time", 27835, 2020, 138));
        myMovies.add(new Movie("Parasite", 480795, 2019, 132));
        myMovies.add(new Movie("Interstellar", 1458094, 2014, 169));
        myMovies.add(new Movie("The Matrix", 1637022, 1999, 136));

        List<Movie> moviesBefore2000 = myMovies.stream().filter(x -> x.getProductionYear() < 2000).collect(Collectors.toList());
        System.out.println("All movies: " + myMovies);
        System.out.println("Movies before year 2000: " + moviesBefore2000);

        List<Movie> moviesOver140 = myMovies.stream().filter(x -> x.getDuration() > 140).collect(Collectors.toList());
        System.out.println("All movies: " + myMovies);
        System.out.println("Movies longer than 140 minutes: " + moviesOver140);*/
    }
}
