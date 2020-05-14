package fowler;

public class NewReleasePrice implements Price {
    @Override
    public double calculateCostForDays(int rentalDays) {
        return rentalDays * 3.;
    }
}
