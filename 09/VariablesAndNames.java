public class VariablesAndNames {
    public static void main(String[] args) {
	// Creating Variables
	int cars, drivers, passengers, carsNotDriven, carsDriven;
	double spaceInCar, carpoolCapacity, averagePassengersPerCar;

	// Declare varables values
	cars = 100;
	spaceInCar = 4;
	drivers = 30;
	passengers = 90;
	// Calulate the values
	carsNotDriven = cars - drivers;
	carsDriven = drivers;
	carpoolCapacity = carsDriven * spaceInCar;
	averagePassengersPerCar = passengers / carsDriven;

	// Outputting results
	System.out.println("There are " + cars + " cars available.");
	System.out.println("There are only " + drivers + " drivers available.");
	System.out.println("There will be " + carsNotDriven + " empty cars today.");
	System.out.println("We can transport " + carpoolCapacity + " people today.");
	System.out.println("We have " + passengers + " to carpool today.");
	System.out.println("We need to put about " + averagePassengersPerCar + " in each car.");
    }
}