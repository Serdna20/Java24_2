package characters;

public class Character {
    String name;
    String occupation;
    String phrase;
    int age;

    // alt + insert for auto constructor
    public Character(String name, String occupation, String phrase, int age) {
        this.name = name;
        this.occupation = occupation;
        this.phrase = phrase;
        this.age = age;
    }

    public Character() {}    
    
    public void greeting(){
        System.out.println(this.phrase);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}
