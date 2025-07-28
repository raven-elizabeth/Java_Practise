package book_character;

import java.util.Scanner;
import java.lang.reflect.Field;

public class Story {

    public static void main(String[] args) throws IllegalAccessException {
        System.out.println("Welcome to Story Builder.");
        Scanner scanner = new Scanner(System.in);

        Protagonist hero = new Protagonist();
        Antagonist villain = new Antagonist();

        Field[] heroFields = Protagonist.class.getFields();
        Field[] villainFields = Antagonist.class.getFields();

        setFields(heroFields, scanner, hero, "hero");
        setFields(villainFields, scanner, villain, "villain");

        System.out.printf("There once lived a %s in %s, called %s. At age %s, they found out their destiny was %s.\n", hero.getGender(), hero.getCountry(), hero.getName(), hero.getAge(), hero.getDestiny());
        System.out.printf("%s is what drove them to fulfill such a destiny. And the first task would be to defeat %s, a %s.\n", hero.getMotivation(), villain.getName(), villain.getPublicPersona());
        System.out.printf("With their %s, %s battled their hardest, but %s proved difficult to defeat due to their %s and %s's %s\n", hero.getStrength(), hero.getName(), villain.getName(), villain.getWeaponOfChoice(), hero.getName(), hero.getWeakness());
        System.out.printf("They searched for allies to fight against the %s of %s, and found %s to help them.\n", villain.getStrength(), villain.getName(), hero.getAllies());
        System.out.printf("%s was committed to %s, but harboured a great secret: %s.\n", villain.getName(), villain.getMotivation(), villain.getSecret());
        System.out.printf("%s discovered that %s's weakness was %s. They used this knowledge, and the reminder that %s to finally take %s down.\n", hero.getName(), villain.getName(), villain.getWeakness(), hero.getPrincipleBelief(), villain.getName());


    }

    public static void setFields(Field[] args, Scanner scanner, Object charType, String charLabel) throws IllegalAccessException {
        for(Field field: args) {
            String fieldValue = getField(scanner, charLabel, field);
            field.set(charType, fieldValue);
        }
    }

    public static String getField(Scanner scanner, String characterType, Field field) {
        System.out.printf("What is your %s's %s", characterType,field.getName());
        return scanner.nextLine();
    }

}
