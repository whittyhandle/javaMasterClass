package CodingExercise30;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person person;

    @BeforeEach
    void setUp() {
        person = new Person();
    }

    @Test
    void getFirstName() throws NoSuchFieldException, IllegalAccessException {
        //given a person object has been setup
        //when we set a value
        //then (using reflection) get a instance of the class and the field
        final Field field = person.getClass().getDeclaredField("firstName");
        // make the private accessible
        field.setAccessible(true);
        field.set(person, "Jon");
        String result = person.getFirstName();
        // check if the expected value matches the field's value
        assertEquals("Jon", result, "Fields didn't match");
    }

    @Test
    void getAge() throws NoSuchFieldException, IllegalAccessException {
        //given a person object has been setup
        //when we set a value
        //then (using reflection) get a instance of the class and the field
        final Field field = person.getClass().getDeclaredField("age");
        // make the private accessible
        field.setAccessible(true);
        field.set(person, 1);
        int result = person.getAge();
        //then
        assertEquals(1, result, "Fields didn't match");

    }

    @Test
    void setFirstName()  throws NoSuchFieldException, IllegalAccessException {
        //given a person object has been setup
        //when we set a value
        person.setFirstName("Mary");
        final Field field = person.getClass().getDeclaredField("firstName");
        field.setAccessible(true);
        assertEquals("Mary", field.get(person), "Fields didn't match");
    }


    @Test
    void setAge() throws NoSuchFieldException, IllegalAccessException {
        //given a person object has been setup
        //when we set a value
        person.setAge(1);
        final Field field = person.getClass().getDeclaredField("age");
        field.setAccessible(true);
        assertEquals(1, field.get(person), "Fields didn't match");


    }
}