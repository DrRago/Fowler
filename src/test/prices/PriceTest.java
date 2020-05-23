package test.prices;

import static junit.framework.TestCase.assertEquals;

import fowler.*;
import org.junit.Test;

public class PriceTest {
    @Test
    public void testChildrenPriceCalculation() {
        Price price = new ChildrenPrice();
        int daysRented = 5;

        double actual = price.calculateCostForDays(daysRented);
        double expected = 1.5 + (((double) daysRented) - 3) * 1.5;
        assertEquals(actual, expected);
    }

    @Test
    public void testNewReleasePriceCalculation() {
        Price price = new NewReleasePrice();
        int daysRented = 5;

        double actual = price.calculateCostForDays(daysRented);
        double expected = (double) daysRented * 3;
        assertEquals(actual, expected);
    }

    @Test
    public void testRegularPriceCalculation() {
        Price price = new RegularPrice();
        int daysRented = 5;

        double actual = price.calculateCostForDays(daysRented);
        double expected = 2.0 + (((double) daysRented) - 2) * 1.5;
        assertEquals(actual, expected);
    }

    @Test
    public void testRegularPriceFrequentRenterPoints() {
        int daysRented = 5;

        Movie movie = new Movie("Test movie for frequent renter points", new RegularPrice());
        Rental rental = new Rental(movie, daysRented);


        int actual = rental.getRentalPoints();
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void testNewReleasePriceFrequentRenterPoints() {
        int daysRented = 5;

        Movie movie = new Movie("Test movie for frequent renter points", new NewReleasePrice());
        Rental rental = new Rental(movie, daysRented);

        int actual = rental.getRentalPoints();
        int expected = 2;
        assertEquals(actual, expected);
    }
}
