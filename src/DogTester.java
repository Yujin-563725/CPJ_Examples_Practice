public class DogTester {
    public static void main(String[] args) {
        Dog choy = new Dog("BarkChoy", "Woof");
        System.out.println(choy);
        choy.speak();
        System.out.println(Dog.GENUS);
    }
}
