public class Main {
    public static void main(String[] args) {
        Person a1 = new Person("Svend", "Bent", 23);
        Person a2 = new Person("Hanne", "Holdt", 34);
        Person a3 = new Person("Anders", "Hansen", 44);

        System.out.println(a1.getFirstName());

        a1.setAge(44);
        System.out.println(a1.getAge());

        a1.insertAnimal("Dog");
        a1.insertAnimal("Cat");
        a1.insertAnimal("Crocodile");

        System.out.println(a1);

    }
}