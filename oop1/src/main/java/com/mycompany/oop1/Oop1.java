package com.mycompany.oop1;
import characters.Character;
public class Oop1 {

    public static void main(String[] args) {
        Character homero = new Character("Homero", "Inspector de seguridad", "A la grande le puse cuca", 33);
        homero.greeting();
        System.out.println(homero.getAge());
        Character bart = new Character();
        bart.setPhrase("Ay caramba");
        bart.greeting();
    }
}
