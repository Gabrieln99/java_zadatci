package hr.unipu.studenti2B;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Glavna klasa za unos i ispis podataka o studentima.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> studenti = new ArrayList<>();

        while (true) {
            System.out.println("\nOdaberite opciju:");
            System.out.println("1 - Unos novog studenta");
            System.out.println("2 - Ispis svih studenata");
            System.out.println("3 - Izlaz");
            System.out.print("Unesite opciju: ");

            int izbor = scanner.nextInt();
            scanner.nextLine();

            if (izbor == 1) {

                Student s = new Student();

                System.out.print("Unesite ime: ");
                s.setName(scanner.nextLine());

                System.out.print("Unesite prezime: ");
                s.setSurname(scanner.nextLine());

                System.out.print("Unesite ID studenta: ");
                s.setId(scanner.nextLine());

                while (true) {
                    System.out.print("Unesite šifru predmeta (0 za prekid unosa): ");
                    int sifra = scanner.nextInt();
                    scanner.nextLine();

                    if (sifra == 0) break;

                    System.out.print("Unesite naziv predmeta: ");
                    String predmet = scanner.nextLine();

                    System.out.print("Unesite ocjenu: ");
                    int ocjena = scanner.nextInt();
                    scanner.nextLine();

                    s.addGrade(sifra, predmet, ocjena);
                }

                studenti.add(s);
                System.out.println("Student uspješno dodan!\n");

            } else if (izbor == 2) {

                System.out.println("\nPopis studenata:");
                for (Student s : studenti) {
                    System.out.println(s);
                }

            } else if (izbor == 3) {

                System.out.println("Izlaz iz programa...");
                break;

            } else {
                System.out.println("Neispravan unos, pokušajte ponovo.");
            }
        }

        scanner.close();
    }
}
