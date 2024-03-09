package entities;

public class Company extends TaxPayer {
    private Integer numberOfEmployees;

    public Company() { }

    public Company(String name, Double anualIncome, Integer numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        if (numberOfEmployees > 10 ) {
            return super.getAnualIncome() * 0.14;
        }

        return super.getAnualIncome() * 0.16;
    }

    @Override
    public String toString() {
        return super.getName() +
                ": $" +
                String.format("%.2f", tax());
    }
}
