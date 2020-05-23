package fowler;

public class Movie {
    private final String title;
    private final Price price;

    /**
     * Construct a new movie
     *
     * @param newTitle the title of the movie
     * @param price    the price object for the rental
     */
    public Movie(String newTitle, Price price) {
        title = newTitle;
        this.price = price;
    }

    /**
     * Check whether the movie price is a new release
     *
     * @return true if it is a new release
     */
    public boolean isNewRelease() {
        return price instanceof NewReleasePrice;
    }

    /**
     * Calculate the cost of a rental for a given amount of days
     *
     * @param rentalDays the days to calculate the cost for
     * @return the cost
     */
    public double calculateCostForDays(int rentalDays) {
        return price.calculateCostForDays(rentalDays);
    }

    /**
     * Get the title of the movie
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }
}