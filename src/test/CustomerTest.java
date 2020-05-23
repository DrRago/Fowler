package test;

import static junit.framework.TestCase.assertTrue;

import fowler.Customer;
import fowler.Movie;
import fowler.Rental;
import org.junit.Test;

import fowler.RegularPrice;

public class CustomerTest {
    @Test
    public void testGetStatement() {
        int daysRented = 5;
        Customer customer = new Customer("Test Customer");
        Movie movie = new Movie("Test movie for customer statement fetching", new RegularPrice());
        Rental rental = new Rental(movie, daysRented);

        customer.addRental(rental);

        String statement = customer.statement();
        boolean expected = statement.contains("Amount owed is " + rental.calculateCost());
        assertTrue(expected);
    }
}
