import java.util.ArrayList;
import java.util.List;

public class InteractionWithAnimal {

    public void CommandToDog(String nickname, Commands commands) {

        List<Dog> getDog = new ArrayList<>();
        getDog.add(new Dog(nickname));

        for (Dog dogs : getDog) {
            if (dogs.getNickname().equals(nickname) && commands == Commands.COMETOME) {
                System.out.println(dogs.getNickname() + " run to human");
            }
            if (dogs.getNickname().equals(nickname) && commands == Commands.VOICE) {
                System.out.println(dogs.getNickname() + " Woof");
            }
            if (dogs.getNickname().equals(nickname) && commands == Commands.GOODBOY) {
                System.out.println(dogs.getNickname() + " wag the tail");
            }

        }

    }

    public void CommandToCat(String nickname, Commands commands) {

        List<Cat> getCat = new ArrayList<>();
        getCat.add(new Cat(nickname));


        for (Cat cats : getCat) {
            if (cats.getNickname().equals(nickname) && commands == Commands.KISKIS) {
                System.out.println(cats.getNickname() + " run to human");
            }
            if (cats.getNickname().equals(nickname) && commands == Commands.LIE) {
                System.out.println(cats.getNickname() + " lie on the back");
            }

        }

    }

    public void HamsterInteraction(String nickname) {

        List<Hamster> getHamster = new ArrayList<>();
        getHamster.add(new Hamster(nickname));
        for (Hamster hamsters : getHamster) {
            if (hamsters.getNickname().equals(nickname)) {
                Hamster getOrdinaryActivity = new Hamster(nickname);
                System.out.print(hamsters.getNickname());
                getOrdinaryActivity.ordinaryActivity();
            }


        }
    }
}
