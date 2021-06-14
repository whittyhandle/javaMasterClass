package CodingExercise33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarpetTest {

    @Test
    public void propertiesAreSetOnCarpetConstructorIsNotZero() {
        double costSetTo = 12;
        double carpetConstructorSet = 12;
        Carpet testedObject = new Carpet(costSetTo);
        assertEquals(carpetConstructorSet, testedObject.getCost(), "values not the same");

    }

    @Test
    public void propertiesAreSetOnCarpetConstructorIsZero() {
        double costSetToZero = 0;
        double carpetConstructorSetZero = 0;
        Carpet testedObjectZero = new Carpet(costSetToZero);
        assertEquals(carpetConstructorSetZero, testedObjectZero.getCost(), "values not the same");
    }




}