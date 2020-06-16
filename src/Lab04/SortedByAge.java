package Lab04;

import java.util.Comparator;

public class SortedByAge implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        String firstName1 = o1.getFirstName();
        String firstName2 = o2.getFirstName();
        String lastName1 = o1.getLastName();
        String lastName2 = o2.getLastName();
        Integer age1 = o1.getAge();
        Integer age2 = o2.getAge();

        int result = age1.compareTo(age2);

        //Если возраст одинаковые, то сравниваем по имени
        if (result == 0){
            result = firstName1.compareTo(firstName2) ;
        }

        //Если имена и возраст одинаковые, то сравниваем по фамилии
        if (result == 0){
            result = lastName1.compareTo(lastName2);
        }

        return result;
    }
}
