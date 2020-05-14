package fowler;

public class ChildrenPrice implements Price {
    @Override
    public double calculateCostForDays(int rentalDays) {
        if (rentalDays > 3)
            return 1.5 + (rentalDays - 3) * 1.5;
        return 1.5;
    }
}
