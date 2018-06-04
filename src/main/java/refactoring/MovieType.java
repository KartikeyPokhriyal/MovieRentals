package refactoring;

import java.util.List;

abstract class MovieType {
    protected int price_code_value;


    public abstract double calculateAmount(int rentedDays);
}
