package test;

import static junit.framework.TestCase.assertEquals;

import fowler.Movie;
import fowler.Rental;
import org.junit.Test;

import fowler.ChildrenPrice;
import fowler.NewReleasePrice;

public class RentalTest {
    @Test
    public void testGetChargeWithNewReleasePrice() {
        int daysRented = 10;
        Movie movie = new Movie("Test movie with new release pricing", new NewReleasePrice());
        Rental rental = new Rental(movie, daysRented);

        double actual = rental.calculateCost();
        double expected = (double) daysRented * 3;
        assertEquals(expected, actual);
    }

    @Test
    public void testGetChargeWithChildrenPrice() {
        int daysRented = 5;
        Movie movie = new Movie("Test movie with children price", new ChildrenPrice());
        Rental rental = new Rental(movie, daysRented);

        double actual = rental.calculateCost();
        double expected = 1.5 + (((double) daysRented) - 3) * 1.5;
        assertEquals(expected, actual);
    }
}
