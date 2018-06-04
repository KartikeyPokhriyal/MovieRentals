import org.junit.Test;
import refactoring.Customer;
import refactoring.Movie;
import refactoring.Rental;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    @Test
    public void shouldReturnAmountStatementForARegularMovie() {
        Customer customer = new Customer("Kartikey");
        customer.addRental(new Rental(new Movie("Salt", Movie.CHILDREN), 4));

        assertEquals("Rental record for " + "Kartikey"+ "\n" + "\t" + "Salt" + "\t"
                + "3.0" + "\n" +
                "Amount owed is " + "3.0" + "\n" + "You earned " + "1" + " frequent renter points", customer.statement());
    }



}
