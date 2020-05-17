package Kalkulator;

import java.util.Scanner;

public class Kalkulator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcja;
        double x;
        double y ;
        double wynik;

        do{
            System.out.println();
            System.out.println("MENU - opcje przeliczania");
            System.out.println("1 - Dodawanie");
            System.out.println("2 - Odejmowanie");
            System.out.println("3 - Zamiana km/h ma m/s");
            System.out.println("4 - Zamiana m/s na km/h");
            System.out.println("0 - KONIEC ");
            System.out.print("Twój wybór: ");
            opcja = scanner.nextInt();

            switch (opcja){
                case 1:
                    System.out.println("Podaj wartości które chcesz dodać");
                x = scanner.nextDouble();
                y = scanner.nextDouble();
                wynik = x + y ;
                    System.out.printf("Wynik wynosi : %.2f ",wynik);
                break;
                case 2:
                    System.out.println("Podaj wartości które chcesz odjąć");
                    x = scanner.nextDouble();
                    y = scanner.nextDouble();
                    wynik = x - y ;
                    System.out.printf("Wynik wynosi : %.2f ",wynik);
                    break;
                case 3:
                    System.out.print("Podaj wartoś: ");
                    x = scanner.nextDouble();
                    wynik = kmhNaMs(x);
                    System.out.printf("%.2f km/h = %.2f m/s", x, wynik);
                    break;
                case 4:
                    System.out.print("Podaj wartoś: ");
                    x = scanner.nextDouble();
                    wynik = msNakmh(x);
                    System.out.printf("%.2f km/h = %.2f m/s", x, wynik);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Błędna opcja, spróbuj ponownie");
                    break;

            }

        }while (opcja!= 0);

    }
    private static double kmhNaMs(double kmh){
        return  kmh * 1000 /3600;
    }
    private static  double msNakmh(double ms){
        return  ms * 0.001 * 3600;
    }
}
