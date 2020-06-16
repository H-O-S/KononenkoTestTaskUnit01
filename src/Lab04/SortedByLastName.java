package Lab04;

import java.util.Comparator;

public class SortedByLastName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        String firstName1 = o1.getFirstName();
        String firstName2 = o2.getFirstName();
        String lastName1 = o1.getLastName();
        String lastName2 = o2.getLastName();
        Integer age1 = o1.getAge();
        Integer age2 = o2.getAge();

        int result = lastName1.compareTo(lastName2);

        //Если фамилии одинаковые, то сравниваем по имени
        if (result == 0){
            result = firstName1.compareTo(firstName2) ;
        }

        //Если имена и фамилии одинаковые, то сравниваем по возрасту
        if (result == 0){
            result = age1.compareTo(age2);
        }

        return result;
    }
}
