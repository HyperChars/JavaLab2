import java.util.List;
import java.util.stream.Collectors;

public class RentalService {

    private List<Rental> rentalList;

    public RentalService(List<Rental> rentalList) {
        this.rentalList = rentalList;
    }

    public List<Rental> findRentalsByRenter(String firstName, String lastName) {
        return rentalList.stream()
                .filter(rental -> rental.getRenter().getFirstName().equalsIgnoreCase(firstName) &&
                        rental.getRenter().getLastName().equalsIgnoreCase(lastName))
                .collect(Collectors.toList());
    }
}
