package fowler;

public class Movie {
    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private final String title;
    private final int priceCode;

    public Movie(String newTitle, int newPriceCode) {
        title = newTitle;
        priceCode = newPriceCode;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public double calculateCostForDays(int rentalDays) {
        double thisAmount = 0;
        switch (getPriceCode()) {
            case Movie.REGULAR:
                thisAmount += 2;
                if (rentalDays > 2)
                    thisAmount += (rentalDays - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                thisAmount += rentalDays * 3;
                break;
            case Movie.CHILDREN:
                thisAmount += 1.5;
                if (rentalDays > 3)
                    thisAmount += (rentalDays - 3) * 1.5;
                break;
        }
        return thisAmount;
    }

    public String getTitle() {
        return title;
    }
}