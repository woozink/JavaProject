import java.util.*;
import java.util.stream.Collectors;

public class PersonClass {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<Person>();

        people.add(new Person("김우진", 26, "인천시"));
        people.add(new Person("김우진", 30, "성남시"));
        people.add(new Person("김연아", 31, "서울시"));
        people.add(new Person("손흥민", 32, "강원도"));


        Collections.sort(people, new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                if (p1.getName().equals(p2.getName())) {
                    return p1.getAge() - p2.getAge();
                } else {
                    return p1.getName().compareTo(p2.getName());
                }
            }
        });


        for (int i = 0; i < people.size(); i++) {
            System.out.println(
                    "이름 : " + people.get(i).getName() +
                            ", 나이 : " + people.get(i).getAge() +
                            ", 거주지 : " + people.get(i).getResidence());
        }

    }
}

class Person {
    private String name;
    private int age;
    private String residence;

    public Person(String name, int age, String residence) {
        this.name = name;
        this.age = age;
        this.residence = residence;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getResidence() {
        return residence;
    }

}
