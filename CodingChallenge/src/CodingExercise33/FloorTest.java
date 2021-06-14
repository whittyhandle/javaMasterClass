package CodingExcercise33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FloorTest {

	@Test
	public void propertiesAreSetOnCarpetConstructorIsNotZero() {
		double widthSetTo = 2;
		double lengthSetTo = 2;
		double floorWidthConstructorSet = 2;
		double floorLengthConstructorSet = 2;
		Floor testedObject = new Floor(widthSetTo, lengthSetTo);
		assertEquals(floorWidthConstructorSet, testedObject.getWidth(), "values not the same");
		assertEquals(floorLengthConstructorSet, testedObject.getLength(), "values not the same");

	}

	@Test
	public void propertiesAreSetOnCarpetConstructorIsZero() {
		double widthSetToZero = 0;
		double lengthSetToZero = 0;
		double floorConstructorSetZero = 0;
		Floor testedObjectZero = new Floor(widthSetToZero, lengthSetToZero);
		assertEquals(floorConstructorSetZero, testedObjectZero.getWidth(), "values not the same");
		assertEquals(floorConstructorSetZero, testedObjectZero.getLength(), "values not the same");
	}

	@Test
	public void testGetArea() {
		double width = 2;
		double length = 3;
		double area = 6;
		Floor testedObject = new Floor(width, length);
		assertEquals(area, testedObject.getArea(), "values not the same");
	}
    
    	@Test
	public void testGetAreaValidWithZeroValue() {
		double width = 0;
		double length = 3;
		double area = 0;
		Floor testedObject = new Floor(width, length);
		assertEquals(area, testedObject.getArea(), "values not the same");
	}

	@Test
	public void testGetAreaWithNegativeValue() {
		double width = -1;
		double length = 3;
		double area = 0;
		Floor testedObject = new Floor(width, length);
		assertEquals(area, testedObject.getArea(), "values not the same");
	}

}
