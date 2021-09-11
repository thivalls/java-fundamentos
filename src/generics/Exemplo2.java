package generics;

import entities.Box;
import entities.BoxInteger;
import entities.BoxString;

public class Exemplo2 {
    public static void main(String[] args) {
        System.out.println("Estudando generics");
        System.out.println("----------------------------------------------");

        Box<Integer> myBox = new BoxInteger();
        myBox.add(10);
        System.out.println(myBox.abrir());

        System.out.println("----------------------------------------------");

        Box<String> myStringBox = new BoxString();
        myStringBox.add("my object in string");
        System.out.println(myStringBox.abrir());
    }
}
