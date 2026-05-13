package ba.edu.ibu.week11.lectures.unittests.ultimate_task_test;

import ba.edu.ibu.week11.labs.ultimate_java_solution.AcademicCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AcademicCalculatorTest {

    AcademicCalculator calc = new AcademicCalculator();

    @Test
    public void testAddBonus() {
        assertEquals(90, calc.addBonus(85, 5));
    }

    @Test
    public void testCalculatePercentage() {
        assertEquals(50.0, calc.calculatePercentage(50, 100));
    }

    @Test
    public void testPassing() {
        assertTrue(calc.isPassing(60));
    }

    @Test
    public void testNotPassing() {
        assertFalse(calc.isPassing(40));
    }

    @Test
    public void testMaxGrade() {
        assertEquals(95, calc.maxGrade(95, 70));
    }

    @Test
    public void testDivide() {
        assertEquals(5, calc.divide(10, 2));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            calc.divide(5, 0);
        });
    }
}