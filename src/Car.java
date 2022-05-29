public class Car {


    private String model;
    private String colour;
    private String birth;
    private int km;
    private int year;
    private int series;
    private double liter;
    private int wheels;


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public double getLiter() {
        return liter;
    }

    public void setLiter(double liter) {
        this.liter = liter;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public Car() {

    }


    public Car(String model, String colour, String birth, int km, int year, int series, double liter, int wheels) {
        System.out.println("Car1: " + colour + " " + model);
        System.out.println("From: " + birth);
        System.out.println("Year: " + year);
        System.out.println("Series: " + series);
        System.out.println("KM: " + km);
        System.out.println("Liters: " + liter);
        System.out.println("Wheels: " + wheels);
        System.out.println();
    }

    public void carInfo() {
        System.out.println("Car: " + colour + " " + model);
        System.out.println("From: " + birth);
        System.out.println("Year: " + year);
        System.out.println("Series: " + series);
        System.out.println("KM: " + km);
        System.out.println("Liters: " + liter);
        System.out.println("Wheels: " + wheels);
        System.out.println();
    }
}
