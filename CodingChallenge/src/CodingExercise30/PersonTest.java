package CodingExercise30;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    // todo set tests up
    Person person;

    @BeforeEach
    void setUp() {
        person = new Person();
    }

    @Test
    void getFirstName() throws NoSuchFieldException, IllegalAccessException {
        //given a person object has been setup
        //when we set a value
        person.setFirstName("Jon");
        //then (using reflection) get a instance of the class and the field
        final Field field = person.getClass().getDeclaredField("firstName");
        // make the private accessible
        field.setAccessible(true);
        // check if the expected value matches the field's value
        assertEquals("Jon", field.get(person), "Fields didn't match");
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