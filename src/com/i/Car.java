package com.i;

public class Car {
	private String licensePlate;
    private long entryTime;

    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
        this.entryTime = System.currentTimeMillis(); // Store entry time
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public long getEntryTime() {
        return entryTime;
    }
    
    public static void main(String[] args) throws Exception {
        ParkingLot parkingLot = new FeeParking(2);

        Car car1 = new Car("KA 25 SS4366");
        Car car2 = new Car("KA 63 SN4365");

        parkingLot.getCapacity();
        
        ((FeeParking) parkingLot).addCar(car1);
        ((FeeParking) parkingLot).addCar(car2);
        
        parkingLot.getCapacity();

        Thread.sleep(2000); // Simulating time passage

        parkingLot.doPayment(car2);
        parkingLot.getCapacity();
    }
}
