import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "1HGBH41JXMN109186", "ABC123", "2021-01-01", 15000);
        Car car2 = new Car("Honda", "2HGBH41JXMN109187", "XYZ789", "2020-05-10", 10000);
        Car car3 = new Car("Ford", "3HGBH41JXMN109188", "LMN456", "2019-03-15", 20000);

        // Створимо колекцію автомобілів
        List<Car> cars = Arrays.asList(car1, car2, car3);
        CarService carService = new CarService(cars);

        // Знайдемо автомобілі за маркою
        List<Car> toyotaCars = carService.findCarsByMake("Toyota");
        System.out.println("Toyota brand cars: " + toyotaCars);

        // Сортування за пробігом
        List<Car> sortedByMileage = carService.sortCarsByMileage();
        System.out.println("Cars by mileage: " + sortedByMileage);

        // Пошук за VIN кодом
        Car foundCar = carService.findCarByVin("2HGBH41JXMN109187");
        System.out.println("Found a car by VIN: " + foundCar);

        // Використання Comparator для сортування за датою випуску
        List<Car> sortedByReleaseDate = cars.stream()
                .sorted(Car.sortByReleaseDate())
                .collect(Collectors.toList());
        System.out.println("Vehicles by production date: " + sortedByReleaseDate);
    }
}
