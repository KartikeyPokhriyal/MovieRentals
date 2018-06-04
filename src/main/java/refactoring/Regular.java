package refactoring;

public class Regular extends MovieType{

    public Regular(int price_code_value) {
        this.price_code_value = price_code_value;
    }

    public double calculateAmount(int rentedDays) {
        double amount = 0;
        amount += 2;

        if (rentedDays > 2) {
            amount += (rentedDays - 2) * 1.5;
            return amount;
        }
        return amount;
    }
}
