package lb2;

import java.util.*;

public class Collections {
    private final Set<Person> PersonHashSet = new HashSet<>();
    private final Set<PersonV2> PersonV2HashSet = new HashSet<>();

    private final Set<Person> PersonTreeSet = new TreeSet<>();
    private final Set<PersonV2> PersonV2TreeSet = new TreeSet<>();

    private final List<Person> PersonArrayList = new ArrayList<>();
    private final List<PersonV2> PersonV2ArrayList = new ArrayList<>();

    private final List<Person> PersonLinkedList = new LinkedList<>();
    private final List<PersonV2> PersonV2LinkedList = new LinkedList<>();

    private final Map<Integer, Person> PersonHashMap = new HashMap<>();
    private final Map<Integer, PersonV2> PersonV2HashMap = new HashMap<>();

    private final Map<Integer, Person> PersonTreeMap = new TreeMap<>();
    private final Map<Integer, PersonV2> PersonV2TreeMap = new TreeMap<>();





    void start() {
        collectionCreator();
        int chosenAction = 0;
        int collectionsMenuChoice;
        int removeChoice;
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        while (chosenAction != 4){
            actionChoiceMenu();
            chosenAction = scanner.nextInt();
            if (chosenAction == 1) {
                collectionsChoiceMenu();
                collectionsMenuChoice = scanner.nextInt();
                add(collectionsMenuChoice);
            }

            if (chosenAction == 2) {
                collectionsChoiceMenu();
                collectionsMenuChoice = scanner.nextInt();
                showCollection(collectionsMenuChoice);

            }

            if(chosenAction == 3) {
                collectionsChoiceMenu();

                collectionsMenuChoice = scanner.nextInt();
                if(collectionsMenuChoice != 1 && collectionsMenuChoice != 2) {
                    System.out.println("\nKtora osobe z kolei chcesz usunac?");
                    removeChoice = scanner2.nextInt();
                    //removeChoice-=1;
                    remove(collectionsMenuChoice, removeChoice);
                }
                else{
                    System.out.println("\nPodaj dane osoby ktora chcesz usunac");
                    String remFirstName;
                    String remLastName;
                    int remAge;
                    String remJob;
                    scanner.nextLine();
                    System.out.println("Imie:");
                    remFirstName = scanner.nextLine();
                    System.out.println("Nazwisko:");
                    remLastName = scanner.nextLine();
                    System.out.println("Praca:");
                    remJob = scanner.nextLine();
                    System.out.println("Wiek:");
                    remAge = scanner.nextInt();


                    Person remPerson = new Person(remFirstName, remLastName, remAge, remJob);
                    PersonV2 remPersonV2 = new PersonV2(remFirstName, remLastName, remAge, remJob);

                    removeSet(collectionsMenuChoice, remPerson, remPersonV2);
                }
            }

        }
    }





    private void collectionCreator() {
        Person firstP = new Person("Marek", "Klamka", 25, "Sportowiec");
        PersonV2 firstPV2 = new PersonV2("Marek", "Klamka", 25, "Sportowiec");

        PersonHashSet.add(firstP);
        PersonV2HashSet.add(firstPV2);
        PersonTreeSet.add(firstP);
        PersonV2TreeSet.add(firstPV2);
        PersonArrayList.add(firstP);
        PersonV2ArrayList.add(firstPV2);
        PersonLinkedList.add(firstP);
        PersonV2LinkedList.add(firstPV2);
        PersonHashMap.put(1, firstP);
        PersonV2HashMap.put(1, firstPV2);
        PersonTreeMap.put(1, firstP);
        PersonV2TreeMap.put(1, firstPV2);

        Person secondP = new Person("Pawel", "Jumper", 20, "Kaskader");
        PersonV2 secondPV2 = new PersonV2("Pawel", "Jumper", 20, "Kaskader");

        PersonHashSet.add(secondP);
        PersonV2HashSet.add(secondPV2);
        PersonTreeSet.add(secondP);
        PersonV2TreeSet.add(secondPV2);
        PersonArrayList.add(secondP);
        PersonV2ArrayList.add(secondPV2);
        PersonLinkedList.add(secondP);
        PersonV2LinkedList.add(secondPV2);
        PersonHashMap.put(2, secondP);
        PersonV2HashMap.put(2, secondPV2);
        PersonTreeMap.put(2, secondP);
        PersonV2TreeMap.put(2, secondPV2);

        Person thirdP = new Person("Georgio", "Ulani", 42, "Kulturysta");
        PersonV2 thirdPV2 = new PersonV2("Georgio", "Ulani", 42, "Kulturysta");

        PersonHashSet.add(thirdP);
        PersonV2HashSet.add(thirdPV2);
        PersonTreeSet.add(thirdP);
        PersonV2TreeSet.add(thirdPV2);
        PersonArrayList.add(thirdP);
        PersonV2ArrayList.add(thirdPV2);
        PersonLinkedList.add(thirdP);
        PersonV2LinkedList.add(thirdPV2);
        PersonHashMap.put(3, thirdP);
        PersonV2HashMap.put(3, thirdPV2);
        PersonTreeMap.put(3, thirdP);
        PersonV2TreeMap.put(3, thirdPV2);
    }

    private void collectionsChoiceMenu() {
        System.out.println("\n Wybor Kolekcji:\n" +
                "1. Hash Set\n" +
                "2. Tree Set\n" +
                "3. Array List\n" +
                "4. Linked List\n" +
                "5. Hash Map\n" +
                "6. Tree Map\n");
    }

    private void actionChoiceMenu() {
        System.out.println("\n Main Menu:\n" +
                "1. Dodaj element\n" +
                "2. Wyswietl wybrana kolekcje\n" +
                "3. Usun element z kolekcji\n" +
                "4. Wyjdz\n");
    }

    private void add(int a) {
        Scanner scanner = new Scanner(System.in);
        String addedFirstName;
        String addedLastName;
        int addedAge;
        String addedJob;

        System.out.println("Imie:");
        addedFirstName = scanner.nextLine();
        System.out.println("Nazwisko:");
        addedLastName = scanner.nextLine();
        System.out.println("Praca:");
        addedJob = scanner.nextLine();
        System.out.println("Wiek:");
        addedAge = scanner.nextInt();


        Person addedPerson = new Person(addedFirstName, addedLastName, addedAge, addedJob);
        PersonV2 addedPersonV2 = new PersonV2(addedFirstName, addedLastName, addedAge, addedJob);

        switch (a) {
            case 1:
                PersonHashSet.add(addedPerson);
                PersonV2HashSet.add(addedPersonV2);
                break;
            case 2:
                PersonTreeSet.add(addedPerson);
                PersonV2TreeSet.add(addedPersonV2);
                break;
            case 3:
                PersonArrayList.add(addedPerson);
                PersonV2ArrayList.add(addedPersonV2);
                break;
            case 4:
                PersonLinkedList.add(addedPerson);
                PersonV2LinkedList.add(addedPersonV2);
                break;
            case 5:
                PersonHashMap.put(PersonHashMap.size()+1, addedPerson);
                PersonV2HashMap.put(PersonV2HashMap.size()+1, addedPersonV2);
                break;
            case 6:
                PersonTreeMap.put((PersonTreeMap.size()+1), addedPerson);
                PersonV2TreeMap.put((PersonTreeMap.size()+1), addedPersonV2);

        }
    }

    private void remove(int a, int b){
        a-=2;

        switch(a){
            case 1:
                b-=1;
                PersonArrayList.remove(b);
                PersonV2ArrayList.remove(b);
                break;
            case 2:
                b-=1;
                PersonLinkedList.remove(b);
                PersonV2LinkedList.remove(b);
                break;
            case 3:
                PersonHashMap.remove(b);
                PersonV2HashMap.remove(b);
                break;
            case 4:
                PersonTreeMap.remove(b);
                PersonV2TreeMap.remove(b);
        }
    }


    private void removeSet(int a, Person b, PersonV2 c){
        switch(a){
            case 1:
                PersonHashSet.remove(b);
                PersonV2HashSet.remove(c);
                break;
            case 2:
                PersonTreeSet.remove(b);
                PersonV2TreeSet.remove(c);
                break;
        }
    }


    private void showCollection(int a) {
        String headLine = String.format("|%-20s|%-25s|%-20s|%-20s|", "Imie", "Nazwisko", "Wiek", "Praca");
        String breakLine = "--------------------------------------------------------------------------------------------";
        String colBreaker = "###########################################################################################";

        switch (a) {
            case 1:
                System.out.println("\nPerson HashSet");
                System.out.println(headLine);
                System.out.println(breakLine);

                for(var person: PersonHashSet){
                    String output = String.format("|%-20s|%-25s|%-20s|%-20s|", person.getFirstName(), person.getLastName(), person.getAge(), person.getJob());
                    System.out.println(output);
                }

                System.out.println("\n" + colBreaker);

                System.out.println("\nPersonV2 HashSet");
                System.out.println(headLine);
                System.out.println(breakLine);

                for(var person: PersonV2HashSet){
                    String output = String.format("|%-20s|%-25s|%-20s|%-20s|", person.getFirstName(), person.getLastName(), person.getAge(), person.getJob());
                    System.out.println(output);
                }
                break;

            case 2:
                System.out.println("\nPerson TreeSet");
                System.out.println(headLine);
                System.out.println(breakLine);

                for(var person: PersonTreeSet){
                    String output = String.format("|%-20s|%-25s|%-20s|%-20s|", person.getFirstName(), person.getLastName(), person.getAge(), person.getJob());
                    System.out.println(output);
                }

                System.out.println("\n" + colBreaker);

                System.out.println("\nPersonV2 TreeSet");
                System.out.println(headLine);
                System.out.println(breakLine);

                for(var person: PersonV2TreeSet){
                    String output = String.format("|%-20s|%-25s|%-20s|%-20s|", person.getFirstName(), person.getLastName(), person.getAge(), person.getJob());
                    System.out.println(output);
                }
                break;

            case 3:
                System.out.println("\nPerson ArrayList");
                System.out.println(headLine);
                System.out.println(breakLine);

                for(var person: PersonArrayList){
                    String output = String.format("|%-20s|%-25s|%-20s|%-20s|", person.getFirstName(), person.getLastName(), person.getAge(), person.getJob());
                    System.out.println(output);
                }

                System.out.println("\n" + colBreaker);

                System.out.println("\nPersonV2 ArrayList");
                System.out.println(headLine);
                System.out.println(breakLine);

                for(var person: PersonV2ArrayList){
                    String output = String.format("|%-20s|%-25s|%-20s|%-20s|", person.getFirstName(), person.getLastName(), person.getAge(), person.getJob());
                    System.out.println(output);
                }
                break;

            case 4:
                System.out.println("\nPerson LinkedList");
                System.out.println(headLine);
                System.out.println(breakLine);

                for(var person: PersonLinkedList){
                    String output = String.format("|%-20s|%-25s|%-20s|%-20s|", person.getFirstName(), person.getLastName(), person.getAge(), person.getJob());
                    System.out.println(output);
                }

                System.out.println("\n" + colBreaker);

                System.out.println("\nPersonV2 LinkedList");
                System.out.println(headLine);
                System.out.println(breakLine);

                for(var person: PersonV2LinkedList){
                    String output = String.format("|%-20s|%-25s|%-20s|%-20s|", person.getFirstName(), person.getLastName(), person.getAge(), person.getJob());
                    System.out.println(output);
                }
                break;

            case 5:
                System.out.println("\nPerson HashMap");
                System.out.println(headLine);
                System.out.println(breakLine);

                for(Map.Entry<Integer, Person> e: PersonHashMap.entrySet()){
                    Person person = e.getValue();
                        String output = String.format("|%-20s|%-25s|%-20s|%-20s|", person.getFirstName(), person.getLastName(), person.getAge(), person.getJob());
                        System.out.println(output);

                }

                System.out.println("\n" + colBreaker);

                System.out.println("\nPersonV2 HashMap");
                System.out.println(headLine);
                System.out.println(breakLine);

                for(Map.Entry<Integer, PersonV2> e: PersonV2HashMap.entrySet()){
                    PersonV2 person = e.getValue();
                    String output = String.format("|%-20s|%-25s|%-20s|%-20s|", person.getFirstName(), person.getLastName(), person.getAge(), person.getJob());
                    System.out.println(output);
                }
                break;

            case 6:
                System.out.println("\nPerson TreeMap");
                System.out.println(headLine);
                System.out.println(breakLine);

                for(Map.Entry<Integer, Person> e: PersonTreeMap.entrySet()){
                    Person person = e.getValue();
                        String output = String.format("|%-20s|%-25s|%-20s|%-20s|", person.getFirstName(), person.getLastName(), person.getAge(),person.getJob());
                        System.out.println(output);
                    }

                System.out.println("\n" + colBreaker);

                System.out.println("\nPersonV2 TreeMap");
                System.out.println(headLine);
                System.out.println(breakLine);

                for(Map.Entry<Integer, PersonV2> e: PersonV2TreeMap.entrySet()){
                    Person person = e.getValue();
                    String output = String.format("|%-20s|%-25s|%-20s|%-20s|", person.getFirstName(), person.getLastName(), person.getAge(), person.getJob());
                    System.out.println(output);

                }
                break;
        }
    }
}
