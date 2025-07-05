package com.mycompany.balextransit;

import java.util.Random;

public class PassengerSource {
private Company company;
private Random rand;

public PassengerSource(Company company) {
this.company = company;
this.rand = new Random();
}

public boolean requestPickup() {
Location pickup = generateRandomLocation();
Location destination = generateRandomLocation();
Passenger passenger = new Passenger(pickup, destination);
return company.schedulePickup(passenger);
}

private Location generateRandomLocation() {
int x = rand.nextInt(101);
int y = rand.nextInt(101);
return new Location(x, y);
}
}