public class Cat extends Animal {
    public Cat(String nickname){

        super(nickname);
    }

    @Override
    public void Voice() {
        System.out.println("Meow");
    }

    @Override
    public void ordinaryActivity() {
        System.out.println("Sleep");
    }


}
