import java.util.Objects;

public class Rental {
    private Car car;
    private Renter renter;  // Властивість renter
    private String pickUpLocation;
    private String dropOffLocation;
    private String startDate;
    private String endDate;
    private double pricePerDay;
    private double totalPrice;

    public Rental(Car car, Renter renter, String pickUpLocation, String dropOffLocation,
                  String startDate, String endDate, double pricePerDay, double totalPrice) {
        this.car = car;
        this.renter = renter;
        this.pickUpLocation = pickUpLocation;
        this.dropOffLocation = dropOffLocation;
        this.startDate = startDate;
        this.endDate = endDate;
        this.pricePerDay = pricePerDay;
        this.totalPrice = totalPrice;
    }

    public Renter getRenter() {
        return renter;
    }

    public Car getCar() {
        return car;
    }

    public String getPickUpLocation() {
        return pickUpLocation;
    }

    public String getDropOffLocation() {
        return dropOffLocation;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rental rental = (Rental) o;
        return Double.compare(rental.pricePerDay, pricePerDay) == 0 &&
                Double.compare(rental.totalPrice, totalPrice) == 0 &&
                Objects.equals(car, rental.car) &&
                Objects.equals(renter, rental.renter) &&
                Objects.equals(pickUpLocation, rental.pickUpLocation) &&
                Objects.equals(dropOffLocation, rental.dropOffLocation) &&
                Objects.equals(startDate, rental.startDate) &&
                Objects.equals(endDate, rental.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(car, renter, pickUpLocation, dropOffLocation, startDate, endDate, pricePerDay, totalPrice);
    }

    @Override
    public String toString() {
        return "Rental{" +
                "car=" + car +
                ", renter=" + renter +
                ", pickUpLocation='" + pickUpLocation + '\'' +
                ", dropOffLocation='" + dropOffLocation + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", pricePerDay=" + pricePerDay +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
