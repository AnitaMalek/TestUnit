package sda;

import junitparams.JUnitParamsRunner;
import org.junit.Before;
import org.junit.runner.RunWith;


import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
@RunWith(JUnitParamsRunner.class)
public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        this.calculator = new Calculator();
    }

//    @Test
//    public void testAdding1() {
//        int result = calculator.dodawanie(2, 4);
//        Assert.assertEquals(5, result);
//    }
//
//    @Test
//    public void testAdding2() {
//        int result = calculator.odejmowanie(-3, -4);
//        Assert.assertEquals(-7, result);
//    }
//
//    @Test
//    public void testAdding3() {
//        int result = calculator.mnozenie(-2, 3);
//        Assert.assertEquals(-6, result);
//    }
//
//    @Test
//    public void testDivide() {
//        Double result = calculator.divide(3, 8);
//        Assert.assertEquals(Double.valueOf(0.0), result);
//    }

//    @Test
////    public void testSilnia() {
////        int result = calculator.silnia(4);
////        Assert.assertEquals(16, result);
////    }

    BubbleSort bubbleSort;

    @Before
    public void settUp() throws Exception {
        this.bubbleSort = new BubbleSort();
    }

//    @Test
//    public void testBubbleSort() {
//        List<Integer> lista1 = new ArrayList<>();
//        lista1.add(1);
//        lista1.add(3);
//        lista1.add(4);
//        lista1.add(5);
//        lista1.add(7);
//
//        List<Integer> lista2 = new ArrayList<>();
//        lista2.add(5);
//        lista2.add(4);
//        lista2.add(7);
//        lista2.add(3);
//        lista2.add(2);
//
//        Assert.assertEquals(lista1, bubbleSort.sort(lista2));
//    }

    @Test
    public void testPrime() {
        List<Integer> pierwsze = new ArrayList<>();
        pierwsze.add(2);
        pierwsze.add(3);
        pierwsze.add(5);
        pierwsze.add(7);

        Assert.assertEquals(pierwsze, bubbleSort.getPrime(1, 8));
    }

    //    @Test
//    @Parameters(method = "testAdding")
//    public void testAdding(int liczba1, int liczba2, int expected) {
//        assertEquals(expected, calculator.dodawanie(liczba1, liczba2));
//    }
//
//    private Object[] testAdding() {
//        return new Object[]{
//                new Object[]{2, 5, 3},
//                new Object[]{3, 5, 8},
//                new Object[]{5, 6, 11}
//        };
//
//    }
}
