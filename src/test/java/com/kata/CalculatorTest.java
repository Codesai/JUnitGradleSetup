package com.kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @Test
    public void test_example() {
        // Given
        Calculator calculator = new Calculator();

        // When
        int result = calculator.add(2, 3);

        // Then
        assertThat(result).isEqualTo(5);
    }
}
