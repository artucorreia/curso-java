package entities;

public class Individual extends TaxPayer {
    private Double healthExpenditures;

    public Individual() { }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public final double tax() {
        double tax = super.getAnualIncome() < 20000.00 ? getAnualIncome() * 0.15 : getAnualIncome() * 0.25;
        tax -= healthExpenditures * 0.5;

        if (tax < 0.0) {
            return 0.0;
        }
        return tax;
    }

    @Override
    public String toString() {
        return super.getName() +
                ": $" +
                String.format("%.2f", tax());
    }
}
