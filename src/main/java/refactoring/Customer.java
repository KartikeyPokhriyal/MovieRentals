package refactoring;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Customer {
    private String name;

    private List<Rental> rentals = new ArrayList<Rental>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public double calculateTotalAmount() {
        double total_amount = 0;

        for(Rental rental : rentals) {
           MovieType movieType =  rental.getMovie().getMovieType();
           total_amount += movieType.calculateAmount(rental.getDaysRented());
        }
        return total_amount;
    }

    public int calculateFrequentRenterPoints() {
        int frequentRenterPoints = 0;

        for(Rental rental : rentals ) {
            frequentRenterPoints++;
            if (rental.getMovie().getMovieType().price_code_value== 2 && rental.getDaysRented() > 1)
                frequentRenterPoints++;
        }
        return frequentRenterPoints;
    }

    public String statement() {

        String result = "Rental record for " + getName() + "\n";

        for(Rental rental: rentals) {
            MovieType movieType =  rental.getMovie().getMovieType();

            result += "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(movieType.calculateAmount(rental.getDaysRented())) + "\n";

        }

        result += "Amount owed is " + String.valueOf(calculateTotalAmount()) + "\n";
        result += "You earned " + String.valueOf(calculateFrequentRenterPoints()) + " frequent renter points";

        return result;
    }
}
