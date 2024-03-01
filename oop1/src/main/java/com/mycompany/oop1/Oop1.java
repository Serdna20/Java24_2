package com.mycompany.oop1;
public class Oop1 {

    public static void main(String[] args) {
        Character homero = new Character("Homero", "Inspector de seguridad", "A la grande le puse cuca", 33);
        homero.greeting();
        Character bart = new Character("Bartolomeo", "Estudiante", "Ay caramba", 10);
        bart.greeting();
    }

    static class Character {
        String name;
        String occupation;
        String phrase;
        int age;

        public Character(String name, String occupation, String phrase, int age) {
            this.name = name;
            this.occupation = occupation;
            this.phrase = phrase;
            this.age = age;
        }

        void greeting(){
            System.out.println(this.phrase);
        }
    }

}
