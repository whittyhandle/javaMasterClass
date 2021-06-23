package CodingExercise33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CalculatorTest {


        @Test
        public void testGetTotalCost() {
            //given
            Floor mockFloorSetTo = mock(Floor.class);
            Carpet mockCarpetSetTo =  mock(Carpet.class);
            Calculator calculatorActualValue = new Calculator(mockFloorSetTo, mockCarpetSetTo);
            when(mockCarpetSetTo.getCost()).thenReturn(4.0);
            when(mockFloorSetTo.getArea()).thenReturn(2.0);
            //when
            double calculatorExpectedValue = 8;
            //then
            assertEquals(calculatorExpectedValue, calculatorActualValue.getTotalCost(), "values not the same");

        }


    }

}