package CodingExercise30;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    // todo set tests up
    Person person;

    @BeforeEach
    void setUp() {
        person = new Person();
    }

    @Test
    void getFirstName() {
        person.setFirstName("");
        assertNotNull(person.getFirstName());
    }

    @Test
    void setFirstName() {
    }

    @Test
    void getLastName() {
    }

    @Test
    void setLastName() {
    }

    @Test
    void getAge() {
    }

    @Test
    void setAge() {
    }
}