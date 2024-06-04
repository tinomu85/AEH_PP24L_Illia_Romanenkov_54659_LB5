package pl.pp;

import java.util.Scanner;

public class mojaPiataAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj znak do wyświetlenia: ");
        char symbol = scanner.next().charAt(0);

        System.out.print("Podaj liczbę powtórzeń znaku w wierszu: ");
        int columns = scanner.nextInt();

        System.out.print("Podaj liczbę linii do wyświetlenia: ");
        int rows = scanner.nextInt();
        printChars(symbol, columns, rows);
    }

    public static void printChars(char symbol, int columns, int rows) {
        for (int i = 0; i <rows; i++) {
            System.out.println();
            for (int j = 0; j <columns; j++) {
                System.out.print(symbol);
            }
        }
    }
}