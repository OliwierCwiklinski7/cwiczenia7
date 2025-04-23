package Zadanie34;

public class Main {
    public static void main(String[] args) {
        Lion lew = new Lion();
        Cat kot = new Cat();
        Dog pies = new Dog();
        Wolf wilk = new Wolf();
        System.out.println("Lew:");
        lew.makeNoise();
        System.out.println("Kot:");
        kot.makeNoise();
        System.out.println("Pies:");
        pies.makeNoise();
        System.out.println("Wilk:");
        wilk.makeNoise();
        System.out.println("Zwierzęta Kotowate: ");
        lew.roam();
        kot.roam();
        System.out.println("Zwierzęta Psowate");
        pies.roam();
        wilk.roam();

    }
}