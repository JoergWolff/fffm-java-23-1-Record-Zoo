package de.wolffclan;

import java.util.ArrayList;
import java.util.List;

public record Zoo(String name, List<Animal> animals) {

    public Zoo (String name){
        this(name, new ArrayList<>());
    }
    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public double calculateFeed(){
        double feed = 0;
        for(Animal animal:animals){
            feed += animal.species().feedRequirementPerDayInGram();
        }
        return feed;
    }
}
