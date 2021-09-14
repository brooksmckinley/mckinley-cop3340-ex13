/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brooks McKinley
 */

package com.brooksmckinley;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testInterestReport() {
        String expected = "$1500.00 invested at 4.300000% for 6 years compounded 4 times per year is $1938.84.";
        String actual = App.generateInterestReport(1500, 0.043, 6, 4);
        Assertions.assertEquals(expected, actual);
    }
}