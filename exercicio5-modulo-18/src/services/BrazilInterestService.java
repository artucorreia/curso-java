package services;

public class BrazilInterestService implements InterestService{
    private static final Double INTEREST_RATE = 1.0;

    public BrazilInterestService() { }
    @Override
    public Double getInterestRate() {
        return INTEREST_RATE;
    }
}