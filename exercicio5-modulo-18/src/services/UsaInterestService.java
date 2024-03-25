package services;

public class UsaInterestService implements InterestService{
    private static final Double INTEREST_RATE = 1.0;

    public UsaInterestService() {}

    @Override
    public Double getInterestRate() {
        return INTEREST_RATE;
    }
}