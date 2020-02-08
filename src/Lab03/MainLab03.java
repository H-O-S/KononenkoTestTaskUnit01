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
            System.out.println("\nIn each word, all previous occurrences of the last character of this word are deleted:");

            for (String word : string.split(" ")) {
                String lastCharacter = word.substring(word.length() - 1);
                String result = word.replace(lastCharacter, "");
                result = result + lastCharacter;
                System.out.print(result + " ");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("\n\nThe program is executed without errors");
        }
    }
}