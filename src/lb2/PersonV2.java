package lb2;

public class PersonV2 extends Person implements Comparable<Person> {
    public PersonV2(String firstName, String lastName, int age, String job) {
        super(firstName, lastName, age, job);
    }

    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        return super.equals(obj);
    }

}
