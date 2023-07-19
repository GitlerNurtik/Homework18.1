public class Main {
    public static void main(String[] args) {
    Person programmer = new Programmer("Александр");
    Person Dancer = new Dancer("Соня");
    Person Singer = new Singer("Лошара");
    programmer.walk();
    Dancer.walk();
    Singer.walk();
    Person[] massive = new Person[]{programmer,Dancer,Singer};
        for (int i = 0; i < massive.length; i++) {
            System.out.println(massive[i]);
        }
    }
}