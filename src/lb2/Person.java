package lb2;

import java.util.Objects;

public class Person implements Comparable<Person>{
    protected String FirstName;
    protected String LastName;
    protected int Age;
    protected String Job;

    public Person(String firstName, String lastName, int age, String job) {
        FirstName = firstName;
        LastName = lastName;
        Age = age;
        Job = job;
    }

    public String getFirstName(){
        return FirstName;
    }

    public String getLastName(){
        return LastName;
    }

    public int getAge(){
        return Age;
    }

    public String getJob(){
        return Job;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        if(Age != person.Age) return false;
        if(!FirstName.equals(person.FirstName)) return false;
        return LastName.equals(person.LastName);
    }

    @Override
    public int hashCode(){
        return Objects.hash(FirstName, LastName, Age, Job);
    }

    @Override
    public int compareTo(Person person) {
        String prsV2 = person.getFirstName() + " " + person.getLastName() + " " + person.getAge() + " " + person.getJob();
        String prs = FirstName + " " + LastName + " " + Age + " " + Job;
        return prs.compareTo(prsV2);
    }
}
