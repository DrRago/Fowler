package fowler;

public class Movie {
    private final String title;
    private final Price price;

    public Movie(String newTitle, Price price) {
        title = newTitle;
        this.price = price;
    }

    public boolean isNewRelease() {
        return price instanceof NewReleasePrice;
    }

    public double calculateCostForDays(int rentalDays) {
        return price.calculateCostForDays(rentalDays);
    }

    public String getTitle() {
        return title;
    }
}