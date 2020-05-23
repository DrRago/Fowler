package fowler;

public class Rental {
    private final Movie movie;
    private final int daysRented;

    /**
     * Construct a new rental
     *
     * @param newMovie      the movie to rent
     * @param newDaysRented the days of the rental
     */
    public Rental(Movie newMovie, int newDaysRented) {
        movie = newMovie;
        daysRented = newDaysRented;
    }

    /**
     * Calculate the cost of the rental
     *
     * @return the rental cost
     */
    public double calculateCost() {
        return movie.calculateCostForDays(daysRented);
    }

    /**
     * Calculate the rental points
     *
     * @return the rental points
     */
    public int getRentalPoints() {
        return getMovie().isNewRelease() && daysRented > 1 ? 2 : 1;
    }

    /**
     * Get the rental days
     *
     * @return the rental days
     */
    public int getDaysRented() {
        return daysRented;
    }

    /**
     * Get the movie of the rental
     *
     * @return the movie
     */
    public Movie getMovie() {
        return movie;
    }
}