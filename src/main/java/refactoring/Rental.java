package refactoring;

import java.util.Objects;

public class Rental {

    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rental)) return false;
        Rental rental = (Rental) o;
        return daysRented == rental.daysRented &&
                Objects.equals(movie, rental.movie);
    }

    @Override
    public int hashCode() {

        return Objects.hash(movie, daysRented);
    }
}
