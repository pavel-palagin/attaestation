import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Animal dog = new Dog("Reks");
        Animal cat = new Dog("Milka");
        Hamster hamster = new Hamster("Rino");



        InteractionWithAnimal interaction = new InteractionWithAnimal();
        interaction.CommandToDog(dog.getNickname(), Commands.GOODBOY);
        interaction.CommandToCat(cat.getNickname(), Commands.KISKIS);
        interaction.HamsterInteraction(hamster.getNickname());

    }



}
