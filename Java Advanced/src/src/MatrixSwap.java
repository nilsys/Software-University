package src;

import java.util.Scanner;

public class MatrixSwap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] text = readInput(scanner);

        String inputTokens = scanner.nextLine();
        while (!inputTokens.equals("END")) {
            try {
                String[] tokens = inputTokens.split("\\s+");
                if(tokens.length > 5) {
                    throw new IllegalStateException();
                }
                int row1 = Integer.parseInt(tokens[1]);
                int col1 = Integer.parseInt(tokens[2]);
                int row2 = Integer.parseInt(tokens[3]);
                int col2 = Integer.parseInt(tokens[4]);

                String temp = text[row1][col1];
                text[row1][col1] = text[row2][col2];
                text[row2][col2] = temp;

                printMatrix(text);
            } catch (IndexOutOfBoundsException | IllegalStateException ex) {
                System.out.println("Invalid input!");
            }
            inputTokens = scanner.nextLine();
        }
    }

    private static String[][] readInput(Scanner scanner) {
        String[] input = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        String[][] matrix = new String[rows][cols];
        for (int row = 0; row < rows; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");
        }
        return matrix;
    }

    private static void printMatrix(String[][] text) {
        for (int row = 0; row < text.length; row++) {
            for (int col = 0; col < text[row].length; col++) {
                System.out.print(text[row][col] + " ");
            }
            System.out.println();
        }

    }
}
