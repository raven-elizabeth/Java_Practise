package book_character;

public class Character{

    private String name;
    private int age;
    private String gender;
    private String ethnicity;
    private String country;
    private String hairColour;
    private String eyeColour;
    private double heightInCm;
    private String motivation;
    private String allies;
    private String weakness;
    private String strength;

    // Constructor
//    public Character(String name,
//                     int age,
//                     String gender,
//                     String ethnicity,
//                     String nationality,
//                     String hairColour,
//                     String eyeColour,
//                     double heightInCm,
//                     String motivation,
//                     String allies,
//                     String weakness,
//                     String strength) {
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//        this.ethnicity = ethnicity;
//        this.nationality = nationality;
//        this.hairColour = hairColour;
//        this.eyeColour = eyeColour;
//        this.heightInCm = heightInCm;
//        this.motivation = motivation;
//        this.allies = allies;
//        this.weakness = weakness;
//        this.strength = strength;
//    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public String getCountry() {
        return country;
    }

    public String getHairColour() {
        return hairColour;
    }

    public String getEyeColour() {
        return eyeColour;
    }

    public double getHeightInCm() {
        return heightInCm;
    }

    public String getMotivation() {
        return motivation;
    }

    public String getAllies() {
        return allies;
    }

    public String getWeakness() {
        return weakness;
    }

    public String getStrength() {
        return strength;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void setGender(String newGender) {
        this.gender = newGender;
    }

    public void setEthnicity(String newEthnicity) {
        this.ethnicity = newEthnicity;
    }

    public void setCountry(String newCountry) {
        this.country = newCountry;
    }

    public void setHairColour(String newHairColour) {
        this.hairColour = newHairColour;
    }

    public void setEyeColour(String newEyeColour) {
        this.eyeColour = newEyeColour;
    }

    public void setHeightInCm(double newHeightInCm) {
        this.heightInCm = newHeightInCm;
    }

    public void setMotivation(String newMotivation) {
        this.motivation = newMotivation;
    }

    public void setAllies(String newAllies) {
        this.allies = newAllies;
    }

    public void setWeakness(String newWeakness) {
        this.weakness = newWeakness;
    }

    public void setStrength(String newStrength) {
        this.strength = newStrength;
    }
}