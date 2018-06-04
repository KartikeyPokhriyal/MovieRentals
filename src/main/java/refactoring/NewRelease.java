package refactoring;

import java.util.List;

public class NewRelease extends MovieType{

    public NewRelease(int price_code_value) {
        this.price_code_value = price_code_value;
    }

    public double calculateAmount(int rentedDays) {
        double amount = 0;
        amount += rentedDays * 3;
        return amount;
    }
}
