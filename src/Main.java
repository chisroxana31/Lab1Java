
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class Main {
    // testen fur problem 1
    @Test
    public void testAusreichend() {
        int[] noten = {35, 42, 55, 30, 38};
        int[] expected = {35, 30, 38};
        assertArrayEquals(expected, Problem1.ausreichend(noten));
    }

    @Test
    public void testDurchschnittswert() {
        int[] noten = {60, 75, 80, 90};
        int expected = 76; // (60 + 75 + 80 + 90) / 4 = 76
        assertEquals(expected, Problem1.durchsnittswert(noten));
    }

    @Test
    public void testAbgerundetenNoten() {
        int[] noten = {35, 42, 55, 30, 38};
        int[] expected = {35, 42, 55, 30, 40};
        assertArrayEquals(expected, Problem1.abgerundetenNoten(noten));
    }

    @Test
    public void testMaximaleNoten() {
        int[] noten = {35, 42, 55, 30, 38};
        int expected = 55; // The maximum is 55, and the rounded grade is 55.
        assertEquals(expected, Problem1.maximaleNoten(noten));
        System.out.println("Alle Tests für Problem 1 bestanden.");
    }

    ///Testen fur problem 2.

    @Test
    public void testMaxim() {
        int[] noten = {84, 29, 67, 38, 41, 33};
        int expected = 84;
        assertEquals(expected, Problem2.maxim(noten));
    }

    @Test
    public void testMinim() {
        int[] noten = {84, 29, 67, 38, 41, 33};
        int expected = 29;
        assertEquals(expected, Problem2.minim(noten));
    }

    @Test
    public void testMinSumme() {
        int[] noten = {84, 29, 67, 38, 41, 33};
        int expected = 208; // 29 + 67 + 38 + 41 + 33
        assertEquals(expected, Problem2.minSumme(noten));
    }

    @Test
    public void testMaxSumme() {
        int[] noten = {84, 29, 67, 38, 41, 33};
        int expected = 263; // 84 + 67 + 38 + 41 + 33
        assertEquals(expected, Problem2.maxSumme(noten));
        System.out.println("Alle Tests für Problem 2 bestanden.");
    }

    ///Testen fur problem 3

    @Test
    public void testFromArrayToInt() {
        int[] array = {1, 2, 3, 4, 5};
        int expected = 12345;
        assertEquals(expected, Problem3.fromArrayToInt(array));
    }

    @Test
    public void testSummeZahlen() {
        int[] array1 = {9, 7, 8, 6, 5};
        int[] array2 = {3, 2, 1, 4, 5};
        int[] expected = {1, 3, 0, 0, 1, 0};
        assertArrayEquals(expected, Problem3.summeZahlen(array1, array2));
    }

    @Test
    public void testDifferenzZahlen() {
        int[] zahl1 = {5, 7, 8, 6, 5};
        int[] zahl2 = {3, 2, 1, 4, 5};
        int[] expected = {2, 5, 7, 2, 0};
        assertArrayEquals(expected, Problem3.differenzZahlen(zahl1, zahl2));
    }

    @Test
    public void testMultipliziertDigit() {
        int[] largeNumber = {2, 5, 6, 4, 3};
        int digit = 3;
        int[] expected = {7, 6, 9, 2, 9};
        assertArrayEquals(expected, Problem3.multipliziertDigit(largeNumber, digit));
    }

    @Test
    public void testDivisionDigit() {
        int[] largeNumber = {9, 7, 6, 5, 3};
        int divisor = 3;
        int[] expected = {3, 2, 5, 5, 1};
        assertArrayEquals(expected, Problem3.divisionDigit(largeNumber, divisor));
        System.out.println("Alle Tests für Problem 3 bestanden.");
    }
}


