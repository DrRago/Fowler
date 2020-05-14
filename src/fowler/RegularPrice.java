package fowler;

public class RegularPrice implements Price {
    @Override
    public double calculateCostForDays(int rentalDays) {
        if (rentalDays > 2)
            return 2 + (rentalDays - 2) * 1.5;
        return 2;
    }
}
