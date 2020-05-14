package fowler;

class Rental {
    private final Movie movie;
    private final int daysRented;

    public Rental(Movie newMovie, int newDaysRented) {
        movie = newMovie;
        daysRented = newDaysRented;
    }

    public double calculateCost() {
        return movie.calculateCostForDays(daysRented);
    }

    public int getRentalPoints() {
        return getMovie().getPriceCode() == Movie.NEW_RELEASE && daysRented > 1 ? 2 : 1;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }
}