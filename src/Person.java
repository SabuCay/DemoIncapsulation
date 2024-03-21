public class Person {
    private String firstName;
    private String lastName;
    private int age;

    private String[] animal;

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        animal = new String[5];
    }

    public void setFirstName(String newFirstName){
        firstName = newFirstName;
    }
    public String getFirstName(){
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getAnimal() {
        return animal;
    }

    public void setAnimal(String[] animal) {
        this.animal = animal;
    }

    public void insertAnimal(String newAnimal){
        for (int i = 0; i < animal.length; i++){
            if (animal[i] == null){
                animal[i] = newAnimal;
                break;
            }
        }

    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("First name: ").append(firstName)
                .append("\nLast name: ").append(lastName)
                .append("\nAge: ").append(age)
                .append("\nAnimals: ");
        if (animal != null) {
            sb.append("[ ");
            for (int i = 0; i < animal.length; i++){
                sb.append(animal[i]);
                if (i < animal.length -1){
                    sb.append(", ");
                }
            }
        }
        sb.append(" ]");
        return sb.toString();
    }
}
