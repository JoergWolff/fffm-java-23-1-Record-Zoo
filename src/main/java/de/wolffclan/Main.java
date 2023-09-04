package de.wolffclan;

public class Main {
    public static void main(String[] args) {

        Animal zebra = new Animal(1,"Streifi","Horse",5);
        Animal zebra2 = new Animal(1,"Streifi","Horse",5);
        Animal hippo = new Animal(2,"Hippopotamus","Horse",3);
        Animal aligator  = new Animal(3,"Kroko","Aligator",10);

        System.out.println(zebra.toString());
        System.out.println(zebra2.toString());
        System.out.println(hippo.toString());
        System.out.println(aligator.toString());
        System.out.println("zebra1 is equal zebra2 : " +zebra.equals(zebra2));
        System.out.println();
    }
}