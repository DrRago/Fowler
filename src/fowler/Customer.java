package fowler;

import java.util.*;

class Customer {
    private final String name;
    private final ArrayList<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    /**
     * Produce a statement string with the customer information including all rentals
     *
     * @return the customer information string
     */
    public String statement() {
        String format = "%1$-10s%2$-10s%3$-20s\n";

        StringBuilder result = new StringBuilder("fowler.Rental Record for " + name + "\n");
        // header line
        result.append(String.format(format, "Title", "Days", "Amount"));

        for (Rental rental : rentals) {
            //show figures for this rental
            result.append(String.format(format, rental.getMovie().getTitle(), rental.getDaysRented(), rental.calculateCost()));
        }

        //add footer lines
        result.append("Amount owed is ").append(getTotalRentalAmount()).append("\n");
        result.append("You earned ").append(getFrequentRentalPoints()).append(" frequent renter points");
        return result.toString();
    }

    /**
     * Sum frequent rental points of all rentals
     *
     * @return the total frequent rental points
     */
    private int getFrequentRentalPoints() {
        return rentals.stream().map(Rental::getRentalPoints).reduce(0, Integer::sum);
    }

    /**
     * Sum rental amounts
     *
     * @return the total rental amounts
     */
    private double getTotalRentalAmount() {
        return rentals.stream().map(Rental::calculateCost).reduce(0., Double::sum);
    }
}
    