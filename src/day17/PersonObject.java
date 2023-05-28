package day17;

import java.util.ArrayList;
import java.util.Arrays;

public class PersonObject {
    public static void main(String[] args) {
        Person person1 = new Person("Ali", 'M', 15);
        Person person2 = new Person("Veli", 'M', 13);
        Person person3 = new Person("Aylin", 'F', 16);

        ArrayList <Person> personList = new ArrayList<>();

        personList.addAll(Arrays.asList(person1,person2,person3));

        //personList.add(person1);

        //System.out.println(personList);

        for (Person each:personList
             ) {
            if (each.gender=='M'){
                System.out.println(each.name);
            }
        }

    }
}
