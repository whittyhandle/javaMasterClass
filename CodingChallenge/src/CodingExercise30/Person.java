package CodingExercise30;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person () {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("invalid age set");
            return;
        }
        this.age = age;
    }
    //todo isTeen Method and check if string is empty
}
