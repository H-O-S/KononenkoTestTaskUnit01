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

import java.util.Arrays;

public class MainLab04 {
    public static void main(String[] args) {
        Student[] students = new Student[6];
        students[0] = new Student("Oleh", "Khrulov", Gender.MALE, 39, 3);
        students[1] = new Student("Sergiy", "Kononenko", Gender.MALE, 21, 4);
        students[2] = new Student("Alex", "Sidorov", Gender.MALE, 29, 2);
        students[3] = new Student("Eugenia", "Petrova", Gender.FEMALE, 25, 5);
        students[4] = new Student("Oleh", "Khrulov", Gender.MALE, 27, 1);
        students[5] = new Student("Eugenia", "Ivanova", Gender.FEMALE, 25, 2);

        // выведем данные без сортировки
        System.out.println("============ no sorted ==============");
        for (Student student : students) {
            System.out.println(student);
        }

        // отсортируем и выведем данные по Имени
        System.out.println("========== sorted by First Name===========");
        Arrays.sort(students, new SortedByFirstName());

        for (Student student : students) {
            System.out.println(student);
        }

        // отсортируем и выведем данные по Фамилии
        System.out.println("========== sorted by Last Name===========");
        Arrays.sort(students, new SortedByLastName());

        for (Student student : students) {
            System.out.println(student);
        }

        // отсортируем и выведем данные по Фамилии
        System.out.println("========== sorted by Age===========");
        Arrays.sort(students, new SortedByAge());

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
