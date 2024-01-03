package src.threads.semaphore;

public class Car {

    private String carName;
    private String carNumber;

    public Car(String carName, String carNumber) {
        this.carName = carName;
        this.carNumber = carNumber;
    }

    public String getCarName() {
        return carName;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }


    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", carNumber='" + carNumber + '\'' +
                '}';
    }
}
