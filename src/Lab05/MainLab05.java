/**
 * Java Kononenko Test Task.
 * Laboratory work 05.
 *
 * @author Oleg Khrulov
 * @version dated 15.06.2020
 */

/*
        Модифікувати  лабораторну  роботу  №3 (виконати наступну дію з текстовим рядком -
        у кожному слові заданого тексту, видалити всі попередні входження останньої літери цього слова,
        тип рядка визначено по черзі як - String, StringBuilder, StringBuffer) наступним  чином:
            1). для  літер,  слів, речень,  розділових  знаків  та  тексту  створити  окремі  класи.
            2). Слово  повинно складатися з масиву літер,
            речення з масиву слів та розділових знаків, текст з масиву речень.
            3). Замінити послідовність табуляцій та пробілів одним пробілом.
            4).  Створити клас, який складається з виконавчого методу, що виконує описану
            дію з лабораторної роботи №3, але в якості типів використовує створені класи.
            5). Необхідно  обробити  всі  виключні  ситуації,  що  можуть  виникнути  під  час
            виконання програмного коду.
*/

package Lab05;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class MainLab05 {
    private static String string = "";
    private static StringBuilder stringB1 = null;
    private static StringBuilder stringB2 = null;

    public static void main(String[] args) {
        try {
            dataEntry();

            processingString();

            processingStringB(stringB1);
            processingStringB(stringB2);

        } catch (Exception e) {
            System.out.println("\n\nError:\n" + e.getMessage());
        } finally {
            System.out.println("\n\nThe end program!");
        }
    }

    private static void dataEntry() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a string:");
        string = scanner.nextLine();

        System.out.println("Please enter a StringBuilder:");
        stringB1 = new StringBuilder(scanner.nextLine());

        System.out.println("Please enter a StringBuffer:");
        StringBuffer stringBuffer = new StringBuffer(scanner.nextLine());
        stringB2 = new StringBuilder(stringBuffer.subSequence(0, stringBuffer.length()));

        System.out.println("\nIn each word, all previous occurrences of the last character of this word are deleted:");
        scanner.close();
    }

    private static void processingString() {
        for (String word : string.split(" ")) {
            if (word.length() < 1) {
                continue;
            }
            String lastCharacter = word.substring(word.length() - 1);
            String result = word.replace(lastCharacter, "") + lastCharacter;
            System.out.print(result + " ");
        }
        System.out.println();
    }

    private static void processingStringB(@NotNull StringBuilder stringB) {
        removeExtraSpacesInStringB(stringB);

        SpacesAtTheEnd:
        for (int i = 0; i < stringB.length(); ) {
            int indexEndWord = stringB.indexOf(" ", i);

            while (i == indexEndWord) {
                ++i;
                if (i >= stringB.length()) {
                    break SpacesAtTheEnd;
                }
                indexEndWord = stringB.indexOf(" ", i);
            }

            StringBuilder word = new StringBuilder(stringB.substring(i, indexEndWord));
            StringBuilder lastCharacter = new StringBuilder(word.substring(word.length() - 1));

            deleteAllOccurrencesOfTheLastCharacter(word, lastCharacter);
            i = ++indexEndWord;
        }
        System.out.println();
    }

    private static void removeExtraSpacesInStringB(@NotNull StringBuilder stringB) {
        while (stringB.indexOf(" ", 0) == 0) {
            stringB.deleteCharAt(0);
        }
        if ((stringB.lastIndexOf(" ")) != (stringB.length() - 1)) {
            stringB.append(" ");
        }
    }

    private static void deleteAllOccurrencesOfTheLastCharacter(@NotNull StringBuilder word, @NotNull StringBuilder lastCharacter) {
        int indexForDelete = 0;
        do {
            indexForDelete = word.indexOf(lastCharacter.toString(), indexForDelete);
            word.deleteCharAt(indexForDelete);
        } while (indexForDelete <= (word.length() - 1));

        System.out.print(word.append(lastCharacter) + " ");
    }
}
