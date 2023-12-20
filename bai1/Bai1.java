package bai1;

import java.util.Arrays;
import java.util.List;

public class Bai1 {
    public static void findUnmarried(List<Person> people) {
        System.out.println("\nUnmarried Individuals:");
        for (Person person : people) {
            if (person instanceof Individual) {
                if (((Individual) person).getCouple() == null) {
                    System.out.println(person.getInfo());
                }
            }
        }
    }

    public static void findCouplesWithTwoChildren(List<Person> people) {
        System.out.println("\nCouples with Two Children:");
        for (Person person : people) {
            if (person instanceof Couple) {
                Couple couple = (Couple) person;
                if (couple.getChildren().size() == 2) {
                    System.out.println(couple.getInfo());
                }
            }
        }
    }

    public static void findLatestGenerations(List<Person> people) {
        System.out.println("\nLatest Generations:");
        for (Person person : people) {
            if (person instanceof Individual && ((Individual) person).getCouple() == null) {
                System.out.println(person.getInfo());
            }
        }
    }



    public static void main(String[] args) {
        Individual james = new Individual("James", "01/01/1980", "Male");
        Individual hana = new Individual("Hana", "01/01/1982", "Female");
        Individual ryan = new Individual("Ryan", "01/01/2005", "Male");
        Individual kai = new Individual("Kai", "01/01/2008", "Male");
        Individual jennifer = new Individual("Jennifer", "01/01/2010", "Female");

        Couple jamesAndHana = new Couple(james, hana);
        jamesAndHana.addChild(ryan);
        jamesAndHana.addChild(kai);

        Couple kaiAndJennifer = new Couple(kai, jennifer);

        System.out.println("Family Tree:\n");
        System.out.println(jamesAndHana.getInfo());
        System.out.println(kaiAndJennifer.getInfo());

        findUnmarried(Arrays.asList(james, hana, ryan, kai, jennifer, jamesAndHana, kaiAndJennifer));

        findCouplesWithTwoChildren(Arrays.asList(jamesAndHana, kaiAndJennifer));

        findLatestGenerations(Arrays.asList(james, hana, ryan, kai, jennifer, jamesAndHana, kaiAndJennifer));
    }
}