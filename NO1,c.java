import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CompanyTest {
@Test
public void testSchedulePickupWithAvailableVehicle() {
Company company = new Company();
company.addVehicle(new Vehicle(4)); 
Passenger passenger = new Passenger(new Location(10, 20), new Location(30, 40));
boolean scheduled = company.schedulePickup(passenger);
assertTrue(scheduled, "Pickup should be scheduled when vehicle is available");
}
@Test
public void testSchedulePickupWhenNoVehicleAvailable() {
Company company = new Company();
Passenger passenger = new Passenger(new Location(10, 20), new Location(30, 40));
boolean scheduled = company.schedulePickup(passenger);
assertFalse(scheduled, "Pickup should fail when no vehicles are available");
}
}