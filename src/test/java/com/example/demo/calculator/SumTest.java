package com.example.demo.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SumTest {
    Sum sum = new Sum();

    @Test
    void calculate() {
        int a = 1;
        int b = 2;
        int result = sum.calculate(1,2);

        assertThat(result).isEqualTo(3);
    }
}