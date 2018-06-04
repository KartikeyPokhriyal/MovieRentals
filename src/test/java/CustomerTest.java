import org.junit.Test;
import refactoring.*;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    @Test
    public void shouldReturnAmountStatementForAChildrenMovie() {
        Customer customer = new Customer("Kartikey");

        customer.addRental(new Rental(new Movie("Salt", new Children(1)), 4));

        assertEquals("Rental record for " + "Kartikey"+ "\n" + "\t" + "Salt" + "\t"
                + "3.0" + "\n" +
                "Amount owed is " + "3.0" + "\n" + "You earned " + "1" + " frequent renter points", customer.statement());
    }

    @Test
    public void shouldReturnAmountStatementForARegularMovie() {
        Customer customer = new Customer("Kartikey");
        customer.addRental(new Rental(new Movie("La la land", new Regular(0)), 2));

        assertEquals("Rental record for " + "Kartikey"+ "\n" + "\t" + "La la land" + "\t"
                + "2.0" + "\n" +
                "Amount owed is " + "2.0" + "\n" + "You earned " + "1" + " frequent renter points", customer.statement());
    }

    @Test
    public void shouldReturnAmountStatementForA_NewReleaseMovie() {
        Customer customer = new Customer("Kartikey");
        customer.addRental(new Rental(new Movie("Mean Girls",  new NewRelease(2)), 5));

        assertEquals("Rental record for " + "Kartikey"+ "\n" + "\t" + "Mean Girls" + "\t"
                + "15.0" + "\n" +
                "Amount owed is " + "15.0" + "\n" + "You earned " + "2" + " frequent renter points", customer.statement());
    }

    @Test
    public void shouldReturnAmountStatementForA_NewReleaseAnd_A_ChildrenMovie() {
        Customer customer = new Customer("Kartikey");
        customer.addRental(new Rental(new Movie("Mean Girls", new NewRelease(2)), 5));
        customer.addRental(new Rental(new Movie("Frozen", new Children(1)), 7));

        assertEquals("Rental record for " + "Kartikey"+ "\n" + "\t" + "Mean Girls" + "\t"
                + "15.0" + "\n" + "\t" + "Frozen" + "\t" + "7.5" + "\n" +
                "Amount owed is " + "22.5" + "\n" + "You earned " + "3" + " frequent renter points", customer.statement());
    }

}
