package fowler;

public interface Price {
    /**
     * Calculate the cost for renting a price category for n days
     *
     * @param rentalDays the days of the rental
     * @return the price
     */
    double calculateCostForDays(int rentalDays);
}
