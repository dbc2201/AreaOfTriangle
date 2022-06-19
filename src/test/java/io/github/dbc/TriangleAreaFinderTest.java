package io.github.dbc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TriangleAreaFinderTest {

    private TriangleAreaFinder triangleAreaFinder;

    @BeforeEach
    void setUp() {
        triangleAreaFinder = new TriangleAreaFinder();
    }

    @ParameterizedTest(name = "calculateAreaOfTriangleUsingHeronsFormula({arguments})")
    @CsvSource(value = {"5.0,6.0,9.0", "4.0,5.0,6.0", "6.03,4.47,6.97", "4.92,6.53,6.97"})
    void shouldGiveCorrectResultForCorrectInput(double side1, double side2, double side3) {
        double calculatedArea = triangleAreaFinder.calculateAreaOfTriangleUsingHeronsFormula(side1, side2, side3);
        double semiPerimeter = calculateSemiPerimeter(side1, side2, side3);
        Assertions.assertEquals(
                Math.sqrt(
                        semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3)
                ),
                calculatedArea,
                0.1f,
                "The calculated area is not correct!"
        );
    }

    private double calculateSemiPerimeter(double side1, double side2, double side3) {
        return (side1 + side2 + side3) / 2;
    }
}