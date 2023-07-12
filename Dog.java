public class Dog extends Animal{
    public Dog(String nickname){

        super(nickname);
    }

    @Override
    public void Voice() {

        System.out.println("Woof");
    }

    @Override
    public void ordinaryActivity() {
        System.out.println("Gnaw a bone");
    }


}
