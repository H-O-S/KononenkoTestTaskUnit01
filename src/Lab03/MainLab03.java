/**
 * Java Kononenko Test Task.
 * Laboratory work 03.
 *
 * @author Oleg Khrulov
 * @version dated 08.02.2020
 */

/*
       Створити  клас,  який  складається  з  виконавчого  методу,  що  виконує  дію з
    текстовим рядком (в кожному слові заданого тексту, видалити всі попередні входження останньої
    літери цього слова), тип якого визначено по черзі як - String, StringBuilder, StringBuffer.
    Необхідно обробити всі виключні  ситуації,  що  можуть  виникнути  під  час  виконання  програмного
    коду.  Всі  змінні  повинні  бути  описані  та  значення  їх  задані  у  виконавчому
    методі.
    Для примера при вводе «oleggg khrvvvvlov”. Должно выдать "Oleg khrulov".
*/

package Lab03;

import java.util.Scanner;

public class MainLab03 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter a string:");
            String string = scanner.nextLine();

            System.out.println("Please enter a StringBuilder:");
            StringBuilder stringBuilder = new StringBuilder(scanner.nextLine());

/*
            System.out.println("Please enter a StringBuffer:");
            StringBuffer stringBuffer = new StringBuffer(scanner.nextLine());
*/

            System.out.println("\nIn each word, all previous occurrences of the last character of this word are deleted:");

            for (String word : string.split(" ")) {
                if (word.length() < 1) {
                    continue;
                }
                String lastCharacter = word.substring(word.length() - 1);
                String result = word.replace(lastCharacter, "") + lastCharacter;
                System.out.print(result + " ");
            }
            System.out.println();

            while (stringBuilder.indexOf(" ", 0) == 0) {
                stringBuilder.deleteCharAt(0);
            }

            if ((stringBuilder.lastIndexOf(" ")) != (stringBuilder.length() - 1)) {
                stringBuilder.append(" ");
            }

            SpacesAtTheEnd:
            for (int i = 0; i < stringBuilder.length(); ) {
                int indexForDelete = 0;
                int indexEndWord = stringBuilder.indexOf(" ", i);

                while (i == indexEndWord) {
                    ++i;
                    if (i >= stringBuilder.length()) {
                        break SpacesAtTheEnd;
                    }
                    indexEndWord = stringBuilder.indexOf(" ", i);
                }

                StringBuilder word = new StringBuilder(stringBuilder.substring(i, indexEndWord));
                StringBuilder lastCharacter = new StringBuilder(word.substring(word.length() - 1));

                do {
                    indexForDelete = word.indexOf(lastCharacter.toString(), indexForDelete);
                    word.deleteCharAt(indexForDelete);
                } while (indexForDelete <= (word.length() - 1));

                i = ++indexEndWord;
                System.out.print(word.append(lastCharacter) + " ");
            }

            scanner.close();
        } catch (Exception e) {
            System.out.println("\n\nError:\n" + e.getMessage());
        } finally {
            System.out.println("\n\nThe end program!");
        }
    }
}