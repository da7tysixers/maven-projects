import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class People<SomePerson extends Person> {
    List<SomePerson> personList;


    public People(){
        this(new ArrayList<SomePerson>());
    }

    public People(List<SomePerson> personList){
        this.personList = personList;

    }
    private String name;
    String lastName;
    private Long id;
    Date birthday;
    Character gender;



    public void add(SomePerson person){
        this.personList.add(person);

    }

    public SomePerson findById(Long id){
        for (SomePerson person : personList) {
            if ( person.getId()== id){
                return person; // if id is correct, return this person
            }
        }

     return null;

    }

    public boolean contains(SomePerson person){
       return personList.contains(person);
    }


    public void remove(SomePerson person){
        personList.remove(person);
    }

    public Person[] toArray(){

        Person[] person = new Person[personList.size()];
//        for (int i = 0; i < person.length; i++) {
//            person[i] = personList.get(i);
//        }
        return personList.toArray(person);
    }
}
