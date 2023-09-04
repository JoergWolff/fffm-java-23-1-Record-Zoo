package de.wolffclan;

public class Main {
    public static void main(String[] args) {

        Owner owner1 = new Owner("Bärbel", 46, "Hamburg");
        Owner owner2 = new Owner("Horst", 22, "Köln");
        Owner owner3 = new Owner("Inge", 47, "Düsseldorf");
        Owner owner4 = new Owner("Rudi", 33, "Berlin");

        Animal zebra = new Animal(1,"Streifi","Horse",5, owner1);
        Animal zebra2 = new Animal(1,"Streifi","Horse",5, null);
        Animal hippo = new Animal(2,"Hippopotamus","Horse",3, owner3);
        Animal aligator  = new Animal(3,"Kroko","Aligator",10, owner4);
        Animal aligator2  = new Animal(3,"Krokofant","Aligator",4, owner2);

        System.out.println(zebra.toString());
        System.out.println(zebra2.toString());
        System.out.println(hippo.toString());
        System.out.println(aligator.toString());
        System.out.println(aligator2.toString());

        System.out.println("zebra1 is equal zebra2 : " + zebra.equals(zebra2));
        System.out.println("hippo is not equal zebra2 : " + hippo.equals(zebra2));
        System.out.println();
    }
}