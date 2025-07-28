package book_character;

public class Antagonist extends Character {

    private String secret;
    private String publicPersona;
    private String weaponOfChoice;

    // Constructor
//    public Antagonist(String name,
//                      int age,
//                      String gender,
//                      String ethnicity,
//                      String nationality,
//                      String hairColour,
//                      String eyeColour,
//                      double heightInCm,
//                      String motivation,
//                      String allies,
//                      String weakness,
//                      String strength,
//                      String secret,
//                      String publicPersona,
//                      String weaponOfChoice) {
//        super(name, age, gender, ethnicity, nationality, hairColour, eyeColour, heightInCm, motivation, allies, weakness, strength);
//    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String newSecret) {
        this.secret = newSecret;
    }

    public String getPublicPersona() {
        return publicPersona;
    }

    public void setPublicPersona(String newPublicPersona) {
        this.publicPersona = newPublicPersona;
    }

    public String getWeaponOfChoice() {
        return weaponOfChoice;
    }

    public void setWeaponOfChoice(String newWeaponOfChoice) {
        this.weaponOfChoice = newWeaponOfChoice;
    }

}
