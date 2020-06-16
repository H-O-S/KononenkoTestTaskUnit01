/**
 * Java Kononenko Test Task.
 * Laboratory work 04.
 *
 * @author Oleg Khrulov
 * @version dated 15.06.2020
 */

/*
    1). Створити клас із виконавчим методом, в якому створити масив з об’єктів класу
    студент, який складається як мінімум з 5-и полів.
    2). Відсортувати масив, за одним з полів, за зростанням,
    а за іншим, за спаданням використавши при цьому стандартні засоби сортування.
    3). Всі змінні повинні бути описані та значення їх задані у виконавчому методі.
*/

package Lab04;

import java.util.Comparator;

public class MainLab04 {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student("firstName" + i,
                    "lastName" + i,
                    (i % 2 == 0) ? Gender.MALE : Gender.FEMALE,
                    (i % 2 == 0) ? (18 + i / 2) : (30 - i),
                    (i < 6) ? (i + 1) : (i - 5));
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
