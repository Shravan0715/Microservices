package com.i;

import java.util.HashMap;
import java.util.Map;

public class FeeParking implements ParkingLot{
	
	private int capacity;
	private int emptyspots;
	private Map<String, Car> parkedCars;
	private static final double HOURLY_RATE = 10.0;
	public FeeParking(int capacity) {
        this.capacity = capacity;
        this.emptyspots = capacity; // Initially, all spots are empty
        this.parkedCars = new HashMap<>();
    }

    @Override
    public void parkCar() {
        if (emptyspots > 0) {
            emptyspots--;
            System.out.println("Car parked successfully. Empty spots left: " + emptyspots);
        } else {
            System.out.println("Parking lot is full.");
        }
    }

    @Override
    public void unparkCar() {
        if (emptyspots < capacity) {
            emptyspots++;
            System.out.println("Car unparked successfully. Empty spots left: " + emptyspots);
        } else {
            System.out.println("No cars to unpark.");
        }
    }

    @Override
    public void getCapacity() {
        System.out.println("Total capacity: " + capacity);
        System.out.println("Available spots: " + emptyspots);
    }

    @Override
    public double calculateFee(Car car) {
        long parkedTime = System.currentTimeMillis() - car.getEntryTime();
        double hoursParked = parkedTime / (1000.0 * 60 * 60); // Convert milliseconds to hours
        return Math.ceil(hoursParked) * HOURLY_RATE; // Charge for full hours
    }

    @Override
    public void doPayment(Car car) throws Exception {
        if (!parkedCars.containsKey(car.getLicensePlate())) {
            throw new Exception("Car not found in parking lot.");
        }
        double fee = calculateFee(car);
        System.out.println("Payment of $" + fee + " received for car: " + car.getLicensePlate());
        parkedCars.remove(car.getLicensePlate()); // Remove car after payment
        emptyspots++; // Increase empty spots after car leaves
    }

    public void addCar(Car car) {
        if (emptyspots > 0) {
            parkedCars.put(car.getLicensePlate(), car);
            emptyspots--;
            System.out.println("Car with plate " + car.getLicensePlate() + " parked. Empty spots left: " + emptyspots);
        } else {
            System.out.println("Parking lot is full. Cannot park.");
        }
    }

}
