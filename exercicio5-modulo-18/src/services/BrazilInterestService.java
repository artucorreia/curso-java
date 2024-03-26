package services;

public class BrazilInterestService implements InterestService{
    private static final Double INTEREST_RATE = 2.0;

    public BrazilInterestService() { }
    @Override
    public Double getInterestRate() {
        return INTEREST_RATE;
    }
}