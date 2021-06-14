package CodingExcercise33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

	@Test
	public void propertiesAreSetOnCalculatorConstructorAreSet() {

		Floor floorSetTo = new Floor(2, 4);
		Carpet carpetSetTo = new Carpet(2);

		double calculatorFloorWidthConstructorSet = 2;
		double calculatorFloorLengthConstructorSet = 4;
		double calculatorFloorGetAreaConstructorSet = 8;

		double calculatorCarpetCostConstructorSet = 2;

		Calculator testedObject = new Calculator(floorSetTo, carpetSetTo);
		assertEquals(calculatorFloorWidthConstructorSet, testedObject.getFloor().getWidth(), "values not the same");
		assertEquals(calculatorFloorLengthConstructorSet, testedObject.getFloor().getLength(), "values not the same");
		assertEquals(calculatorFloorGetAreaConstructorSet, testedObject.getFloor().getArea(), "values not the same");
		assertEquals(calculatorCarpetCostConstructorSet, testedObject.getCarpet().getCost(), "values not the same");
		assertEquals(calculatorCarpetCostConstructorSet, testedObject.getCarpet().getCost(), "values not the same");

	}

	@Test
	public void testGetTotalCostValid() {

		Floor floorSetTo = new Floor(2, 4);
		Carpet carpetSetTo = new Carpet(2);

		double totalCost = 16;
		Calculator testedObject = new Calculator(floorSetTo, carpetSetTo);
		assertEquals(totalCost, testedObject.getTotalCost());

	}

	@Test
	public void testGetTotalCostWithZeroParameterValue() {

		Floor floorSetTo = new Floor(0, 4);
		Carpet carpetSetTo = new Carpet(2);

		double totalCost = 0;
		Calculator testedObject = new Calculator(floorSetTo, carpetSetTo);
		assertEquals(totalCost, testedObject.getTotalCost());

	}

	@Test
	public void testGetTotalCostWithNegativeParameterValue() {

		Floor floorSetTo = new Floor(-2, 4);
		Carpet carpetSetTo = new Carpet(2);

		double totalCost = 0;
		Calculator testedObject = new Calculator(floorSetTo, carpetSetTo);
		assertEquals(totalCost, testedObject.getTotalCost());

	}

	@Test
	public void testGetTotalCostWithNegativeCost() {

		Floor floorSetTo = new Floor(-2, 4);
		Carpet carpetSetTo = new Carpet(-2);

		double totalCost = 0;
		Calculator testedObject = new Calculator(floorSetTo, carpetSetTo);
		assertEquals(totalCost, testedObject.getTotalCost());

	}

}
