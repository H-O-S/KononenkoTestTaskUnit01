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
            6). Необходимо учесть, что слова могут быть разделены (одиночными или многократными):
                1. пробелами;
                2. табуляцией;
                3. знаками препинания;
                4. смешанное разделение нескольких типов знаков препинания и/или пробелов;
             7). Также необходимо учесть, что буквы могут быть прописные и строчные, в любой части слова,
             при этом необходимо выполнять поиск и удаление без привязки к регистра буквы.

         Примеры для тестирования.
            1). при вводе «oleggg khrvvvvlov”.
            Должно выдать "oleg khrulov"
            2). если на вход я подам
            kononenkO
            на выходе получить должен
            knnenkO
            3). на вход я подам строку
            serfffegafffF ffrrfffF,FFf,efff  ,eef,,,,,,
            на выход я должен получить
            seregaF rrF,f,ef  ,eef,,,,,,
*/

        /*
        1. Преобразование входящего текста в объект Text.
            1). Во входящем тексте посчитать количество Sentence.
            2). Создать объект Text с указанием количества Sentence для массива.
            3). Во входящем тексте посчитать количество ProposalMembers.
            4). Создать объект Sentence с указанием количества ProposalMembers для массива.
            5). Во входящем тексте посчитать количество Letter.
            6). Создать объект Word с указанием количества Letter для массива.
            7). Входящий текст по символьно обрабатываем, создавая соответствующие объекты.

        2. Обработка объекта Text для удаления предыдущих вхождений последней буквы в каждом слове.
            1). Перебираем циклом каждую букву слова, начиная с конца и удаляем соответствующие буквы.
            2). Создаем новый объект Word с обновленным количеством ячеек в массиве и заменяем им старый объект Word
            в массиве объекта Sentence.
            3). Выводим на экран результат.

        */


package Lab05;

import java.util.Scanner;

public class MainLab05 {
    private static String string = "";
    private static StringBuilder stringB1 = null;
    private static StringBuilder stringB2 = null;
    private static Text text = null;

    public static void main(String[] args) {
        try {
            dataEntry();

            ConvertStringToObjectText();
            processingObjectText();

            ConvertStringBToObjectText(stringB1);
            processingObjectText();

            ConvertStringBToObjectText(stringB2);
            processingObjectText();

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

    private static void ConvertStringToObjectText() {
//        1). Во входящем тексте посчитать количество Sentence. (. ... ! ?)
        char[] stringToChar = string.toCharArray();
        char[] endOfSentenceSymbol = {'.', '!', '?'};

        for (int i = 0; i < stringToChar.length; i++) {
            if (!(Character.isLetterOrDigit(stringToChar[i]))) {
//                stringToChar[i];
            }
        }

//        2). Создать объект Text с указанием количества Sentence для массива.
//        3). Во входящем тексте посчитать количество ProposalMembers.
//        4). Создать объект Sentence с указанием количества ProposalMembers для массива.
//        5). Во входящем тексте посчитать количество Letter.
//        6). Создать объект Word с указанием количества Letter для массива.
//        7). Входящий текст по символьно обрабатываем, создавая соответствующие объекты.

    }

    private static void ConvertStringBToObjectText(StringBuilder stringB) {
//        1). Во входящем тексте посчитать количество Sentence.
//        2). Создать объект Text с указанием количества Sentence для массива.
//        3). Во входящем тексте посчитать количество ProposalMembers.
//        4). Создать объект Sentence с указанием количества ProposalMembers для массива.
//        5). Во входящем тексте посчитать количество Letter.
//        6). Создать объект Word с указанием количества Letter для массива.
//        7). Входящий текст по символьно обрабатываем, создавая соответствующие объекты.

    }

    private static void processingObjectText() {
//        1). Перебираем циклом каждую букву слова, начиная с конца и удаляем соответствующие буквы.
//        2). Создаем новый объект Word с обновленным количеством ячеек в массиве и заменяем им старый объект Word
//        в массиве объекта Sentence.
//        3). Выводим на экран результат.

    }
}
