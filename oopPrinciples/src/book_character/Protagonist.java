package book_character;


public class Protagonist extends Character {

    private String destiny;
    private String principleBelief;

    // Constructor
//    public Protagonist(String name,
//                       int age,
//                       String gender,
//                       String ethnicity,
//                       String nationality,
//                       String hairColour,
//                       String eyeColour,
//                       double heightInCm,
//                       String motivation,
//                       String allies,
//                       String weakness,
//                       String strength,
//                       String destiny,
//                       String principleBelief) {
//        super(name, age, gender, ethnicity, nationality, hairColour, eyeColour, heightInCm, motivation, allies, weakness, strength);
//    }

    public String getDestiny() {
        return destiny;
    }

    public void setDestiny(String newDestiny) {
        this.destiny = newDestiny;
    }

    public String getPrincipleBelief() {
        return principleBelief;
    }

    public void setPrincipleBelief(String newPrincipleBelief) {
        this.principleBelief = newPrincipleBelief;
    }

}
