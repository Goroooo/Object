public class Models {
    public static void main(String[] args) {

        Car car = new Car();
        car.setModel("BMW");
        car.setColour("Blue");
        car.setBirth("Japan");
        car.setKm(14000);
        car.setYear(2020);
        car.setLiter(5.5);
        car.setSeries(8);
        car.setWheels(4);
        car.carInfo();

        Car car1 = new Car("Lamborghini", "Yellow", "Italy", 2000, 2022, 5, 4.0, 4);

    }
}
