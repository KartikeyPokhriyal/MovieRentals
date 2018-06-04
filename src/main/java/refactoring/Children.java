package refactoring;

public class Children extends MovieType {

    public Children(int price_code_value) {
        this.price_code_value = price_code_value;
    }
    public double calculateAmount(int rentedDays) {
        double amount = 0;
        amount += 1.5;

        if (rentedDays > 3) {
            amount += (rentedDays - 3) * 1.5;
            return amount;
        }
        return amount;
    }
}
