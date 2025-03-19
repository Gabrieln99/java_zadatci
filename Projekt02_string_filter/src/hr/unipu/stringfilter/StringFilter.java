package hr.unipu.stringfilter;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ZADATAK:
 *
 * program koji će s tipkovnice učitavati String-ove
 * sve dok se ne učita String “kraj”.
 * Nakon što su svi String-ovi
 * učitani, program ispisuje samo String-ove koji imaju
 * jednak broj suglasnika i samoglasnika
 *
 * @author Gabriel Nadal
 * @version 1.0
 */
public class StringFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> stringovi = new ArrayList<>();

        System.out.println("Unesite stringove (za kraj unesite \"kraj\"):");


        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("kraj")) {
                break;
            }

            stringovi.add(input);
        }

        scanner.close();

        System.out.println("Stringovi s jednakim brojem samoglasnika i suglasnika:");

        for (String s : stringovi) {
            if (hasEqualVowelsAndConsonants(s)) {
                System.out.println(s);
            }
        }
    }

    /**
     * Metoda koja broji samoglasnike i suglasnike u stringu.
     *
     * @param str Ulazni string
     * @return True ako string ima jednak broj samoglasnika i suglasnika, inače false
     */
    public static boolean hasEqualVowelsAndConsonants(String str) {
        int samoglasnici = 0;
        int suglasnici = 0;

        str = str.toLowerCase();

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1) {
                    samoglasnici++;
                } else {
                    suglasnici++;
                }
            }
        }

        return samoglasnici == suglasnici;
    }
}
