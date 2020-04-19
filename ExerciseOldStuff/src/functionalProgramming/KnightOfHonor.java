package functionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class KnightOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Consumer<String> cons = str -> System.out.println("Sir " + str);
        Arrays.stream(scanner.nextLine().split("\\s+")).forEach(cons);
    }
}
